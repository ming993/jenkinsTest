package common.utils;


import com.alibaba.fastjson.JSONObject;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;

public class ClassUtil {

    public static JSONObject getValueFromModel(Object obj, String attributeName) {
        JSONObject json = new JSONObject();
        try {
            if (obj == null) {
                json.put("success", false);
                return json;
            }
            Class clazz = obj.getClass();
            if (attributeName.equals("id") || attributeName.equals("createBy")) {
                clazz = obj.getClass().getSuperclass();
            }
            Method method = clazz.getMethod("get" + attributeName.substring(0, 1).toUpperCase() + attributeName.substring(1));
            if (method == null) {
                json.put("success", false);
                return json;
            }
            Field field = clazz.getDeclaredField(attributeName);// 是java的反射机制，获取类中属性name（列名）
            String type = field.getGenericType().toString();// 获得此属性的类型
            Object value = method.invoke(obj);
            if (value == null) {
                json.put("success", false);
                return json;
            }
            if (type.equals("class java.lang.String")) {
                value = "'" + value.toString() + "'";
            }
            json.put("success", true);
            json.put("msg", value);
            if (type.indexOf("Date") > -1) {
                if (value != null) {
                    json.put("msg", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(value));
                } else {
                    json.put("msg", "");
                }
            }
            return json;
//            } else if ("class java.lang.String".equals(type)) {
//                json.put("success", true);
//                json.put("msg", (String) value);
//                return json;
//            } else if ("class java.math.BigDecimal".equals(type)) {
//                json.put("success", true);
//                json.put("msg", value);
//                return json;
//            } else if (type.equals("int")) {
//                json.put("success", true);
//                json.put("msg", value.toString());
//                return json;
//            } else if (type.equals("class java.lang.Integer")) {
//                json.put("success", true);
//                json.put("msg", value.toString());
//                return json;
//            } else if (type.indexOf("java.lang.Boolean") >= 0) {
//                json.put("msg", (Boolean) value);
//                json.put("success", true);
//                return json;
//            }else if (type.indexOf("java.lang.Long") >= 0) {
//                json.put("msg", (Long) value);
//                json.put("success", true);
//                return json;
//            } else {
//                json.put("success",false);
//                return json;
//            }
        } catch (Exception e) {
            e.printStackTrace();
            json.put("success", false);
            return json;
        }
    }
}
