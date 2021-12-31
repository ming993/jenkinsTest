package common.annotation;

import java.lang.annotation.*;

/**
 * 文件名称： com.socks.zhhc.core.common.annotation.DuplicateEntity
 * 初始作者： Francis.Ding</br>
 * 创建日期： 2019/9/23 15:41</br>
 * 功能说明： 【重复值实体注解】 <br/>
 * =================================================<br/>
 * 修改记录：<br/>
 * 修改作者 日期 修改内容<br/>
 * ================================================<br/>
 * Copyright (c) 2019-2020 .All rights reserved.<br/>
 */
@Target({ElementType.PARAMETER, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DuplicateEntity {

    String erroMessage() default "数据重复添加！";
}
