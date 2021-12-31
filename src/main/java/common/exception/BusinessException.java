package common.exception;

/**
 * 文件名称： com.socks.zhhc.core.common.exception.BusinessException.java</br>
 * 初始作者： Mark.Yao</br>
 * 创建日期： 2019年9月6日</br>
 * 功能说明： 用于封装业务类型的异常 <br/>
 * =================================================<br/>
 * 修改记录：<br/>
 * 修改作者        日期       修改内容<br/>
 * ================================================<br/>
 * Copyright (c) 2019-2020 .All rights reserved.<br/>
 */
public class BusinessException extends Exception {

    /**
     * 字段描述: [序列化编号]
     */
    private static final long serialVersionUID = 1L;

    /**
     * 错误编码
     */
    String code;

    public String getCode() {
        return code;
    }

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String message, String code) {
        super(message);
        this.code = code;
    }

    public BusinessException(String message, Throwable cause, String code) {
        super(message, cause);
        this.code = code;
    }

    public BusinessException(Throwable cause, String code) {
        super(cause);
        this.code = code;
    }

}
