package com.ev.informationPublish.companyInfo.service.imp;

import com.ev.informationPublish.companyInfo.entity.CompanyInfo;
import com.ev.informationPublish.companyInfo.service.CompanyInfoService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;


/**
 * 文件名称： CompanyInfoServiceImpl.java
 * 初始作者： 胡苏明</br>
 * 创建日期： 2020/11/25 9:54</br>
 * 功能说明： 【公司信息 服务实现类】 <br/>
 * =================================================<br/>
 * 修改记录：<br/>
 * 修改作者 日期 修改内容<br/>
 * ================================================<br/>
 * Copyright (c) 2019-2020 .All rights reserved.<br/>
 */
@Service
public class CompanyInfoServiceImpl implements CompanyInfoService {

    @Override
    public CompanyInfo detail() {

        CompanyInfo companyInfo = new CompanyInfo();
        companyInfo.setAddress("芯软");
        companyInfo.setAddress("协信启动中心");
        return companyInfo;
    }

}