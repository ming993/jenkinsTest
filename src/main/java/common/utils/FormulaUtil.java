package common.utils;

import cn.hutool.json.JSONObject;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FormulaUtil {

    //yinhengxing：将系统中的计算公式转化为正规的数学表达式
    public static JSONObject convertFormula(String formula){
        JSONObject returnJson=new JSONObject();
        try{
            Result result=iFunction(formula);
            if(result.success){
                String text=result.getText();

                //剔除计算公式以"("开头，且其对应的闭环")"在末尾，如"(1-2*3)"
                while(text.startsWith("(") && text.endsWith(")")){
                    char[] charArray=text.toCharArray();
                    int in=1; boolean flg=true;
                    for(int i=1;i<charArray.length;i++){
                        if(charArray[i]=='('){
                            in++;
                        }
                        if(charArray[i]==')'){
                            in--;
                        }
                        if(in==0 && i<charArray.length-1){
                            flg=false;
                            break;
                        }
                    }

                    if(flg){
                        text=text.substring(1,charArray.length-1);
                    }else{
                        break;//跳出
                    }
                }
                //修改以"(("起且以"))"闭环为以"("起且以")"闭环，如"1+2*((12+34-56))-3"
                while(text.indexOf("((")>-1 && text.indexOf("))")>text.indexOf("((")){
                    char[] charArray=text.toCharArray();
                    int i=text.indexOf("(("); boolean flg=false;
                    for(int j=i+2;j<charArray.length;j++){
                        if(charArray[j]==')'){
                            if(charArray[j+1]==')'){
                                StringBuilder charBuilder=new StringBuilder(text);
                                charBuilder.deleteCharAt(j);
                                charBuilder.deleteCharAt(i);
                                text=charBuilder.toString();
                                break;
                            }else{
                                flg=true;
                                break;
                            }
                        }
                    }
                    if(flg){
                        break;//跳出
                    }
                }

                //剔除纯数字以"("、")"左右包围的
                StringBuilder charBuilder1=new StringBuilder(text);
                List<Integer> signArray1=new ArrayList<Integer>();
                for(int i=0;i<charBuilder1.length();i++){
                    if(charBuilder1.charAt(i)=='('){
                        signArray1.add(i);
                    }
                    if(charBuilder1.charAt(i)==')'){
                        int in=signArray1.get(signArray1.size()-1);
                        if(i>in){
                            String sonText=charBuilder1.substring(in+1, i);
                            try{
                                double sonValue=Double.parseDouble(sonText);
                                if(sonValue>=0){
                                    charBuilder1.deleteCharAt(i);
                                    charBuilder1.deleteCharAt(in);
                                    signArray1=new ArrayList<Integer>();
                                    i=-1;
                                }else{
                                    signArray1.remove(signArray1.size()-1);
                                    continue;
                                }
                            }catch(Exception e){
                                signArray1.remove(signArray1.size()-1);
                                continue;
                            }
                        }
                    }
                }
                text=charBuilder1.toString();

                //剔除所有括号，“(-20)"格式类型的除外
                StringBuilder charBuilder2=new StringBuilder(text);
                List<Integer> signArray2=new ArrayList<Integer>();
                for(int i=0;i<charBuilder2.length();i++){
                    if(charBuilder2.charAt(i)=='('){
                        signArray2.add(i);
                    }
                    if(charBuilder2.charAt(i)==')'){
                        int in=signArray2.get(signArray2.size()-1);
                        if(i>in){
                            String sonText=charBuilder2.substring(in+1, i);
                            boolean isFuSu;//负数
                            try{
                                double sonValue=Double.parseDouble(sonText);
                                if(sonValue<0){
                                    isFuSu=true;
                                }else{
                                    isFuSu=false;
                                }
                            }catch(Exception e){
                                isFuSu=false;
                            }
                            if(isFuSu){
                                signArray2.remove(signArray2.size()-1);
                                continue;
                            }else{
                                Result sonResult=iFunction(sonText);
                                if(sonResult.success){
                                    BigDecimal sonValue=sonResult.getValue();
                                    if(sonValue.compareTo(BigDecimal.ZERO)<0){
                                        charBuilder2.replace(in+1, i, sonValue.toString());
                                        i=-1;
                                    }else{
                                        if(charBuilder2.substring(in, i+1).indexOf("%")==-1){
                                            charBuilder2.replace(in, i+1, sonValue.toString());
                                            i=-1;
                                        }else{
                                            charBuilder2.replace(in, i+1,sonValue.multiply(new BigDecimal(100)).toString() +"%");
                                        }
                                    }
                                    signArray2=new ArrayList<Integer>();

                                }
                            }
                        }
                    }
                }
                text=charBuilder2.toString();

                returnJson.put("value", result.getValue());//表达式的值
                returnJson.put("text", text.replace("*", "×"));//数学表达式
                returnJson.put("success", true);
                return returnJson;
            }else{
                returnJson.put("success", false);
                returnJson.put("value", 0);
                returnJson.put("text", formula);
                return returnJson;//转化失败
            }
        }catch(Exception e){
            returnJson.put("success", false);
            returnJson.put("value", 0);
            returnJson.put("text", formula);
            return returnJson;//转化异常
        }
    }
    //yinhengxing：递归函数，用以处理计算公式转化
    public static Result iFunction(String formula){//递归函数
        Result result=new Result();

        String[] oneSignArray={"向上取整","向下取整","%","-"};//单目运算符
//双目运算符	String[] twoSignArray={"+","-","*","/"};
        String[] manySignArray={"累加","累乘","Max","Min"};//多目运算符
//其他运算符	String[] otherSignArray={"[","]","(",")"};
//全部运算符	String[] signArray={"+","-","*","/","累加","累乘","向上取整","向下取整","Max","Min","%","[","]","(",")"};

        //剔除中文符号
        formula=formula.replaceAll(" ","");
        formula=formula.replace("，",",");
        formula=formula.replaceAll("（", "(");
        formula=formula.replaceAll("）", ")");
        formula=formula.replaceAll("【", "[");
        formula=formula.replaceAll("】", "]");

        //判断原子性
        boolean singleFlg=true;
        try{
            BigDecimal value=new BigDecimal(formula);

            if(value.compareTo(BigDecimal.ZERO)<0){//即value<0，是负数
                singleFlg=false;
            }else{
                result.setValue(value);
                result.setText(formula);

                result.setSingle(true);
                result.setSuccess(true);
                return result;
            }
        }catch(Exception e){
            singleFlg=false;
        }

        if(singleFlg){
            return result;
        }else{
            result.setSingle(false);

            //多目运算符
            for(String manySign:manySignArray){
                if(formula.startsWith(manySign)){
                    int in=manySign.length();
                    if(formula.charAt(in) != '[' || formula.charAt(formula.length()-1) != ']'){
                        //【多目运算项】与【其他项】的加减乘除运算，应当先做加减乘除运算
                    }else{

                        boolean up=false; boolean down=false; int flg=0;
                        char[] charArray=formula.toCharArray();
                        for(int i=0;i<charArray.length;i++){
                            if(charArray[i]=='['){
                                flg++;
                                up=true;
                            }
                            if(charArray[i]==']'){
                                flg--;
                            }
                            if(up && flg==0 && i<charArray.length-1){
                                down=true;
                                break;
                            }
                        }

                        if(down){
                            break;//存在【多目运算项】与【多目运算项】的加减乘除，如：“累加[1,2,3]-累乘[4,5,6]”，应当先做加减乘除运算
                            //或者，【多目运算项】与【向上下取整运算项】的加减乘除，如：“累加[1,2,3]+向上取整[4.05]”，应当先做加减乘除运算
                        }

                        String sonFormula=formula.substring(in+1, formula.length()-1);

                        //按项分割
                        sonFormula=sonFormula+",";
                        char[] sonChar=sonFormula.toCharArray();
                        List<Result> sonItems=new ArrayList<Result>();
                        int i1=0; int i2=0; int flg1=0;
                        for(int i=0;i<sonChar.length;i++){
                            if(sonChar[i]=='[' || sonChar[i]=='('){
                                flg1++;
                            }
                            if(sonChar[i]==']' || sonChar[i]==')'){
                                flg1--;
                            }
                            if(sonChar[i]==',' && flg1==0){
                                i2=i;
                                String itemFormula=sonFormula.substring(i1, i2);
                                Result sonResult=iFunction(itemFormula);
                                if(sonResult.isSuccess()){
                                    i1=i+1;
                                    sonItems.add(sonResult);
                                }else{
                                    continue;
                                }
                            }
                        }

                        if(manySign.equals("累加")){
                            String text="";
                            BigDecimal value=BigDecimal.ZERO;

                            for(Result sonItem:sonItems){
                                if(sonItem.isSingle()){
                                    text=text+"+"+sonItem.getText();
                                }else{
                                    text=text+"+("+sonItem.getText()+")";
                                }
                                value=value.add(sonItem.getValue());
                            }
                            result.setText(text.substring(1));
                            result.setValue(value);
                            result.setSuccess(true);
                            return result;
                        }

                        if(manySign.equals("累乘")){
                            String text="";
                            BigDecimal value=BigDecimal.ONE;

                            for(Result sonItem:sonItems){
                                if(sonItem.isSingle()){
                                    text=text+"*"+sonItem.getText();
                                }else{
                                    text=text+"*("+sonItem.getText()+")";
                                }
                                value=value.multiply(sonItem.getValue());
                            }
                            result.setText(text.substring(1));
                            result.setValue(value);
                            result.setSuccess(true);
                            return result;
                        }

                        if(manySign.equals("Max")){
                            String text="";
                            BigDecimal value=new BigDecimal(Integer.MIN_VALUE);

                            for(Result sonItem:sonItems){
                                if(sonItem.getValue().compareTo(value)>=0){
                                    value=sonItem.getValue();
                                    text=sonItem.getText();
                                }
                            }
                            result.setText(text);
                            result.setValue(value);
                            result.setSuccess(true);
                            return result;
                        }

                        if(manySign.equals("Min")){
                            String text="";
                            BigDecimal value=new BigDecimal(Integer.MAX_VALUE);

                            for(Result sonItem:sonItems){
                                if(sonItem.getValue().compareTo(value)<=0){
                                    value=sonItem.getValue();
                                    text=sonItem.getText();
                                }
                            }
                            result.setText(text);
                            result.setValue(value);
                            result.setSuccess(true);
                            return result;
                        }

                    }
                }
            }

            //单目运算符
            for(String oneSign:oneSignArray){
                if(formula.startsWith(oneSign)){
                    if(oneSign.equals("-")){//负数
                        String sonFormula=formula.substring(1, formula.length());
                        Result sonResult=iFunction(sonFormula);

                        if(sonResult.isSuccess()){
                            BigDecimal value=BigDecimal.ZERO.subtract(sonResult.getValue());

                            result.setValue(value);
                            result.setText("-"+sonResult.getText());
                            result.setSuccess(true);

                            return result;
                        }else{
                            result.setSuccess(false);
                            return result;
                        }
                    }

                    int in=oneSign.length();
                    if(formula.charAt(in) != '[' || formula.charAt(formula.length()-1) !=']'){
                        //【单目运算项】与【其他项】的加减乘除运算，应当先做加减乘除运算
                    }else{
                        boolean up=false; boolean down=false; int flg=0;
                        char[] charArray=formula.toCharArray();
                        for(int i=0;i<charArray.length;i++){
                            if(charArray[i]=='['){
                                flg++;
                                up=true;
                            }
                            if(charArray[i]==']'){
                                flg--;
                            }
                            if(up && flg==0 && i<charArray.length-1){
                                down=true;
                                break;
                            }
                        }

                        if(down){
                            break;//存在【多目运算项】与【多目运算项】的加减乘除，如：“累加[1,2,3]-累乘[4,5,6]”，应当先做加减乘除运算
                            //或者，【多目运算项】与【向上下取整运算项】的加减乘除，如：“累加[1,2,3]+向上取整[4.05]”，应当先做加减乘除运算
                        }

                        String sonFormula=formula.substring(in+1, formula.length()-1);
                        Result sonResult=iFunction(sonFormula);

                        if(sonResult.isSuccess()){
                            result.setSuccess(true);

                            if(oneSign.equals("向上取整")){
                                BigDecimal value=sonResult.getValue();
                                value=value.setScale(0, BigDecimal.ROUND_UP);

                                result.setText(value.toPlainString());
                                result.setValue(value);//向上取整
                                return result;
                            }

                            if(oneSign.equals("向下取整")){
                                BigDecimal value=sonResult.getValue();
                                value=value.setScale(0,BigDecimal.ROUND_DOWN);

                                result.setText(value.toPlainString());
                                result.setValue(value);//向下取整
                                return result;
                            }
                        }else{
                            result.setSuccess(false);
                            return result;
                        }
                    }
                }else if(formula.endsWith(oneSign)){
                    String sonFormula=formula.substring(0, formula.length()-1);
                    Result sonResult=iFunction(sonFormula);

                    if(sonResult.isSuccess()){
                        BigDecimal value=sonResult.getValue().divide(new BigDecimal(100),2,BigDecimal.ROUND_HALF_UP);
                        result.setText(sonResult.getText()+"%");
                        result.setValue(value);
                        result.setSuccess(true);
                        return result;
                    }else{
                        result.setSuccess(false);
                        return result;
                    }
                }
            }

            //其他运算符
            if(formula.startsWith("(") && formula.endsWith(")")){
                boolean up=false; boolean down=false; int flg=0;
                char[] charArray=formula.toCharArray();
                for(int i=0;i<charArray.length;i++){
                    if(charArray[i]=='('){
                        flg++;
                        up=true;
                    }
                    if(charArray[i]==')'){
                        flg--;
                    }
                    if(up && flg==0 && i<charArray.length-1){
                        down=true;
                        break;
                    }
                }

                if(down){
                    //存在诸如：“(1+2)-(3*4)”，应当先做加减乘除运算
                }else{
                    String sonFormula=formula.substring(1, formula.length()-1);
                    Result sonResult=iFunction(sonFormula);
                    if(sonResult.isSuccess()){
                        result.setText("("+sonResult.getText()+")");
                        result.setValue(sonResult.getValue());
                        result.setSuccess(true);
                        return result;
                    }else{
                        result.setSuccess(false);
                        return result;
                    }
                }
            }

            if(formula.startsWith("[") && formula.endsWith("]")){
                boolean up=false; boolean down=false; int flg=0;
                char[] charArray=formula.toCharArray();
                for(int i=0;i<charArray.length;i++){
                    if(charArray[i]=='['){
                        flg++;
                        up=true;
                    }
                    if(charArray[i]==']'){
                        flg--;
                    }
                    if(up && flg==0 && i<charArray.length-1){
                        down=true;
                        break;
                    }
                }

                if(down){
                    //存在诸如：“[1+2]-[3*4]”，应当先做加减乘除运算
                }else{
                    String sonFormula=formula.substring(1, formula.length()-1);
                    Result sonResult=iFunction(sonFormula);
                    if(sonResult.isSuccess()){
                        result.setText("("+sonResult.getText()+")");
                        result.setValue(sonResult.getValue());
                        result.setSuccess(true);
                        return result;
                    }else{
                        result.setSuccess(false);
                        return result;
                    }
                }
            }

            //双目运算符
            List<String> signValues=new ArrayList<String>();
            formula=formula+"#";
            char[] charArray=formula.toCharArray();
            int i1=0; int i2=0;int flg2=0;
            for(int i=0;i<charArray.length;i++){
                if(charArray[i]=='[' || charArray[i]=='('){
                    flg2++;
                }
                if(charArray[i]==']' || charArray[i]==')'){
                    flg2--;
                }
                if(flg2==0){
                    switch(charArray[i]){
                        case '+':i2=i;signValues.add(formula.substring(i1, i2));signValues.add("+");i1=i+1;break;
                        case '-':i2=i;signValues.add(formula.substring(i1, i2));signValues.add("-");i1=i+1;break;
                        case '*':i2=i;signValues.add(formula.substring(i1, i2));signValues.add("*");i1=i+1;break;
                        case '/':i2=i;signValues.add(formula.substring(i1, i2));signValues.add("/");i1=i+1;break;
                        case '#':i2=i;signValues.add(formula.substring(i1, i2));break;
                    }
                }
            }

            List<String> signTexts=new ArrayList<String>(signValues);

            for(int i=0;i<signValues.size();i++){//处理乘除
                String signValue=signValues.get(i);
                if(signValue.equals("*")){
                    Result sonResult1=iFunction(signValues.get(i-1));
                    Result sonResult2=iFunction(signValues.get(i+1));

                    if(sonResult1.isSuccess() && sonResult2.isSuccess()){
                        result.setSuccess(true);
                        result.setSingle(false);

                        String text1="";
                        String text2="";
                        if(sonResult1.isSingle()){
                            text1=signTexts.get(i-1);
                        }else{
                            text1="("+sonResult1.getText()+")";
                        }
                        if(sonResult2.isSingle()){
                            text2=signTexts.get(i+1);
                        }else{
                            text2="("+sonResult2.getText()+")";
                        }

                        signTexts.set(i, text1+"*"+text2);
                        signTexts.remove(i+1);
                        signTexts.remove(i-1);

                        BigDecimal value=sonResult1.getValue().multiply(sonResult2.getValue());
                        result.setValue(value);

                        signValues.set(i, value.toPlainString());
                        signValues.remove(i+1);
                        signValues.remove(i-1);
                        i=-1;
                    }else{
                        result.setSuccess(false);
                        break;
                    }
                }else if(signValue.equals("/")){
                    Result sonResult1=iFunction(signValues.get(i-1));
                    Result sonResult2=iFunction(signValues.get(i+1));

                    if(sonResult1.isSuccess() && sonResult2.isSuccess()){
                        result.setSuccess(true);
                        result.setSingle(false);

                        String text1="";
                        String text2="";
                        if(sonResult1.isSingle()){
                            text1=signTexts.get(i-1);
                        }else{
                            text1="("+sonResult1.getText()+")";
                        }
                        if(sonResult2.isSingle()){
                            text2=signTexts.get(i+1);
                        }else{
                            text2="("+sonResult2.getText()+")";
                        }

                        signTexts.set(i, text1+"/"+text2);
                        signTexts.remove(i+1);
                        signTexts.remove(i-1);

                        BigDecimal value=sonResult1.getValue().divide(sonResult2.getValue(),5,BigDecimal.ROUND_HALF_UP);
                        result.setValue(value);

                        signValues.set(i, value.toPlainString());
                        signValues.remove(i+1);
                        signValues.remove(i-1);
                        i=-1;
                    }else{
                        result.setSuccess(false);
                        break;
                    }
                }
            }
            for(int i=0;i<signValues.size();i++){//处理加减
                String signValue=signValues.get(i);
                if(signValue.equals("+")){
                    Result sonResult1=iFunction(signValues.get(i-1));
                    Result sonResult2=iFunction(signValues.get(i+1));

                    if(sonResult1.isSuccess() && sonResult2.isSuccess()){
                        result.setSuccess(true);
                        result.setSingle(false);

                        String text1="";
                        String text2="";
                        if(sonResult1.isSingle()){
                            text1=signTexts.get(i-1);
                        }else{
                            text1="("+sonResult1.getText()+")";
                        }
                        if(sonResult2.isSingle()){
                            text2=signTexts.get(i+1);
                        }else{
                            text2="("+sonResult2.getText()+")";
                        }

                        signTexts.set(i, text1+"+"+text2);
                        signTexts.remove(i+1);
                        signTexts.remove(i-1);

                        BigDecimal value=sonResult1.getValue().add(sonResult2.getValue());
                        result.setValue(value);

                        signValues.set(i, value.toPlainString());
                        signValues.remove(i+1);
                        signValues.remove(i-1);
                        i=-1;
                    }else{
                        result.setSuccess(false);
                        break;
                    }
                }else if(signValue.equals("-")){
                    Result sonResult1=iFunction(signValues.get(i-1));
                    Result sonResult2=iFunction(signValues.get(i+1));

                    if(sonResult1.isSuccess() && sonResult2.isSuccess()){
                        result.setSuccess(true);
                        result.setSingle(false);

                        String text1="";
                        String text2="";
                        if(sonResult1.isSingle()){
                            text1=signTexts.get(i-1);
                        }else{
                            text1="("+sonResult1.getText()+")";
                        }
                        if(sonResult2.isSingle()){
                            text2=signTexts.get(i+1);
                        }else{
                            text2="("+sonResult2.getText()+")";
                        }

                        signTexts.set(i, text1+"-"+text2);
                        signTexts.remove(i+1);
                        signTexts.remove(i-1);

                        BigDecimal value=sonResult1.getValue().subtract(sonResult2.getValue());
                        result.setValue(value);

                        signValues.set(i, value.toPlainString());
                        signValues.remove(i+1);
                        signValues.remove(i-1);
                        i=-1;
                    }else{
                        result.setSuccess(false);
                        break;
                    }
                }
            }
            result.setText(signTexts.get(0));
            return result;
        }
    }
    //yinhengxing：内部类，用于计算公式转化
    public static class Result {
        String text;//表达式
        BigDecimal value;//表达式的值
        boolean single;//是否为无符号数字
        boolean success;//format是否成功

        public String getText() {
            return text;
        }
        public void setText(String text) {
            this.text = text;
        }
        public BigDecimal getValue() {
            return value;
        }
        public void setValue(BigDecimal value) {
            this.value = value;
        }
        public boolean isSingle() {
            return single;
        }
        public void setSingle(boolean single) {
            this.single = single;
        }
        public boolean isSuccess() {
            return success;
        }
        public void setSuccess(boolean success) {
            this.success = success;
        }
    }
}
