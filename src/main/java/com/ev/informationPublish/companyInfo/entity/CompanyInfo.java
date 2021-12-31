package com.ev.informationPublish.companyInfo.entity;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 文件名称： CompanyInfo.java
 * 初始作者： 胡苏明</br>
 * 功能说明： 【公司信息表】 <br/>
 * =================================================<br/>
 * 修改记录：<br/>
 * 修改作者 日期 修改内容<br/>
 * ================================================<br/>
 * Copyright (c) 2019-2020 .All rights reserved.<br/>
 */
@Data
public class CompanyInfo {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("公司名称")
    private String name;

    @ApiModelProperty("详细地址")
    private String address;


}
