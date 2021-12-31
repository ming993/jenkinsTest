package common.enums;
/**
 * 文件名称： com.ev.hr.enums.SalaryProjectDict.java</br>
 * 初始作者： ev-monitor</br>
 * 创建日期： 2020-05-07 16:01:33</br>
 * 功能说明： 审核状态字典 <br/>
 * =================================================<br/>
 * 修改记录：<br/>
 * 修改作者        日期       修改内容<br/>
 * ================================================<br/>
 * Copyright (c) 2020-2021 .All rights reserved.<br/>
 */
public enum AuditStatusDict {
	WAIT_AUDIT(178L, "待审核"), OK_AUDIT(179L, "已审核");

	private final Long id;
	private final String name;

	AuditStatusDict(long id, String name) {
		this.name = name;
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
