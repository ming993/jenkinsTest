package com.ev.apis.controller.informationPublish.companyInfo;

import com.ev.informationPublish.companyInfo.service.CompanyInfoService;
import framework.annotation.EvApiByToken;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 文件名称： CompanyInfoController.java;
 * 初始作者： 胡苏明</br>
 * 创建日期： 2020/11/25 16:13</br>
 * 功能说明： 【公司信息 前端控制器】 <br/>
 * =================================================<br/>
 * 修改记录：<br/>
 * 修改作者 日期 修改内容<br/>
 * ================================================<br/>
 * Copyright (c) 2019-2020 .All rights reserved.<br/>
 */
@CrossOrigin
@Api(value = "企管管理后台-信息发布-公司信息-执行接口 前端控制器", tags = "企管管理后台-信息发布-公司信息-执行接口 前端控制器")
@RestController
@RequestMapping("/apis/informationPublish/companyInfo")
public class CompanyInfoController {

    @Autowired
    private CompanyInfoService companyInfoService;


    @EvApiByToken(value = "/detail", method = RequestMethod.GET, apiTitle = "详细")
    @ApiOperation("详细")
    public Object detail() {
        return companyInfoService.detail();
    }

}