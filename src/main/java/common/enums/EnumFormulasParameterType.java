package common.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * 枚举类
 * 
 * @author 尹恒星
 * @version 1.0
 *
 */
public enum EnumFormulasParameterType {
	/*
	 * 下面是计算公式中数据类型枚举
	 */
	SALARY_PROJECT("salary_project","薪资项目"),
	MARK("mark","括号"),
	NUM("num","数字"),
	SYMBOL("symbol","运算符");
	private String code;//角色代码
	private String descr;//角色描述
	
	private EnumFormulasParameterType(String code, String descr) {
		this.code = code;
		this.descr = descr;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	private static List<String> listCode = new ArrayList<>();

	static {
		for (EnumFormulasParameterType type : EnumFormulasParameterType.class.getEnumConstants()) {
			listCode.add(type.code);
		}
	}
	public static List<String> getListCode(){
		return  listCode;
	}
	
}

