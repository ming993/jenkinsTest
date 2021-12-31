package common.exception;

/**
 * 文件名称： com.socks.zhhc.core.common.exception.DuplicateException
 * 初始作者： Francis.Ding</br>
 * 创建日期： 2019/9/23 17:24</br>
 * 功能说明： 【重复值异常】 <br/>
 * =================================================<br/>
 * 修改记录：<br/>
 * 修改作者 日期 修改内容<br/>
 * ================================================<br/>
 * Copyright (c) 2019-2020 .All rights reserved.<br/>
 */
public class DuplicateException extends RuntimeException {

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

    public DuplicateException(String message) {
        super(message);
    }

    public DuplicateException(String message, String code) {
        super(message);
        this.code = code;
    }

    public DuplicateException(String message, Throwable cause, String code) {
        super(message, cause);
        this.code = code;
    }

    public DuplicateException(Throwable cause, String code) {
        super(cause);
        this.code = code;
    }
}
