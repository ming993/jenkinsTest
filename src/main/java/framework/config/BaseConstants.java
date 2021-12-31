package framework.config;

/**
 * 文件名称： com.socks.zhhc.core.common.constant.BaseConstants.java</br>
 * 初始作者： Mark.Yao</br>
 * 创建日期： 2019年9月6日</br>
 * 功能说明： 基本常量类 <br/>
 * =================================================<br/>
 * 修改记录：<br/>
 * 修改作者 日期 修改内容<br/>
 * ================================================<br/>
 * Copyright (c) 2019-2020 .All rights reserved.<br/>
 */
public interface BaseConstants {

    /*********************************** 系统级别标识 ***********************************/
    /**
     * 系统级别标记
     */
    String DEFAULT_SYSTEM = "system";

    /**
     * 系统级别标记
     */
    String DEFAULT_SYSTEM_NAME = "系统管理员";

    /**
     * 系统异常提示
     */
    String MSG_SYSTEM_ERROR = "系统异常，请联系管理员";

    /*********************************** 系统操作状态 ***********************************/

    /**
     * 正常
     */
    Integer OPERATION_FLAG_0 = 0;

    /**
     * 删除
     */
    Integer OPERATION_FLAG_1 = 1;

    /*********************************** 常用状态码 ***********************************/
    /**
     * 系统异常编码
     */
    String CODE_SYSTEM_ERROR_500 = "500";

    /**
     * 找不到异常编码
     */
    String CODE_SYSTEM_ERROR_404 = "404";

    /**
     * 未登陆编码
     */
    String CODE_SYSTEM_UNLOGIN_ERROR_401 = "401";
}
