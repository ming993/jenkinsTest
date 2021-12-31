package framework.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * 文件名称： com.socks.zhhc.core.common.config.SpringContext.java</br>
 * 初始作者： Mark.Yao</br>
 * 创建日期： 2019年9月6日</br>
 * 功能说明： 上下文处理类 <br/>
 * =================================================<br/>
 * 修改记录：<br/>
 * 修改作者 日期 修改内容<br/>
 * ================================================<br/>
 * Copyright (c) 2019-2020 .All rights reserved.<br/>
 */
@Component
@Lazy(false)
public class SpringContext implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @SuppressWarnings("static-access")
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    private static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    /**
     * 方法描述: [获取实例.]</br>
     * 初始作者: Mark.Yao<br/>
     * 创建日期: 2019年9月6日-下午12:13:19<br/>
     * 开始版本: 1.0.0<br/>
     * =================================================<br/>
     * 修改记录：<br/>
     * 修改作者 日期 修改内容<br/>
     * ================================================<br/>
     *
     * @param name 实例名称
     * @return Object
     */
    public static Object getBean(String name) {
        return getApplicationContext().getBean(name);
    }

    /**
     * 方法描述: [获取实例.]</br>
     * 初始作者: Mark.Yao<br/>
     * 创建日期: 2019年9月6日-下午12:13:19<br/>
     * 开始版本: 1.0.0<br/>
     * =================================================<br/>
     * 修改记录：<br/>
     * 修改作者 日期 修改内容<br/>
     * ================================================<br/>
     *
     * @param clazz
     * @param <T>
     * @return Object
     */
    public static <T> T getBean(Class<T> clazz) {
        return getApplicationContext().getBean(clazz);
    }

    /**
     * 方法描述: [获取实例.]</br>
     * 初始作者: Mark.Yao<br/>
     * 创建日期: 2019年9月6日-下午12:13:19<br/>
     * 开始版本: 1.0.0<br/>
     * =================================================<br/>
     * 修改记录：<br/>
     * 修改作者 日期 修改内容<br/>
     * ================================================<br/>
     *
     * @param name 实例名称
     * @return Object
     */
    public static <T> T getBean(String name, Class<T> clazz) {
        return getApplicationContext().getBean(name, clazz);
    }

}
