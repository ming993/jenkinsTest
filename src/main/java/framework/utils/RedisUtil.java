package framework.utils;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * 文件名称： com.socks.zhhc.core.common.utils.RedisUtil.java</br>
 * 初始作者： Mark.Yao</br>
 * 创建日期： 2019年9月6日</br>
 * 功能说明： Redis数据库工具类 <br/>
 * =================================================<br/>
 * 修改记录：<br/>
 * 修改作者 日期 修改内容<br/>
 * ================================================<br/>
 * Copyright (c) 2019-2020 .All rights reserved.<br/>
 */
@Component
public class RedisUtil {

    /**
     * redis封装类
     */
    @Resource
    private RedisTemplate<Serializable, Object> redisTemplate;

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    /**
     * 方法描述: [删除方法.]</br>
     * 初始作者: Mark.Yao<br/>
     * 创建日期: 2019年9月6日-上午11:47:09<br/>
     * 开始版本: 1.0.0<br/>
     * =================================================<br/>
     * 修改记录：<br/>
     * 修改作者 日期 修改内容<br/>
     * ================================================<br/>
     *
     * @param keys 标识 void
     */
    public void remove(final String... keys) {
        for (String key : keys) {
            remove(key);
        }
    }

    /**
     * 方法描述: [批量删除（通配符）.]</br>
     * 初始作者: Mark.Yao<br/>
     * 创建日期: 2019年9月6日-上午11:47:09<br/>
     * 开始版本: 1.0.0<br/>
     * =================================================<br/>
     * 修改记录：<br/>
     * 修改作者 日期 修改内容<br/>
     * ================================================<br/>
     *
     * @param pattern 表达式 void
     */
    public void removePattern(final String pattern) {
        Set<Serializable> keys = redisTemplate.keys(pattern);
        if (keys.size() > 0) {
            redisTemplate.delete(keys);
        }
    }

    /**
     * 方法描述: [删除方法.]</br>
     * 初始作者: Mark.Yao<br/>
     * 创建日期: 2019年9月6日-上午11:47:09<br/>
     * 开始版本: 1.0.0<br/>
     * =================================================<br/>
     * 修改记录：<br/>
     * 修改作者 日期 修改内容<br/>
     * ================================================<br/>
     *
     * @param key 标识 void
     */
    public void remove(final String key) {
        if (exists(key)) {
            redisTemplate.delete(key);
        }
    }

    /**
     * 方法描述: [判断缓存中是否有对应的value.]</br>
     * 初始作者: Mark.Yao<br/>
     * 创建日期: 2019年9月6日-上午11:47:09<br/>
     * 开始版本: 1.0.0<br/>
     * =================================================<br/>
     * 修改记录：<br/>
     * 修改作者 日期 修改内容<br/>
     * ================================================<br/>
     *
     * @param key 标识
     * @return boolean 布尔值
     */
    public boolean exists(final String key) {
        return redisTemplate.hasKey(key);
    }

    /**
     * 方法描述: [读取缓存.]</br>
     * 初始作者: Mark.Yao<br/>
     * 创建日期: 2019年9月6日-上午11:47:09<br/>
     * 开始版本: 1.0.0<br/>
     * =================================================<br/>
     * 修改记录：<br/>
     * 修改作者 日期 修改内容<br/>
     * ================================================<br/>
     *
     * @param key 标识
     * @return Object 值对象
     */
    public Object get(final String key) {
        return redisTemplate.opsForValue().get(key);
    }

    /**
     * 方法描述: [写入缓存.]</br>
     * 初始作者: Mark.Yao<br/>
     * 创建日期: 2019年9月6日-上午11:47:09<br/>
     * 开始版本: 1.0.0<br/>
     * =================================================<br/>
     * 修改记录：<br/>
     * 修改作者 日期 修改内容<br/>
     * ================================================<br/>
     *
     * @param key   键
     * @param value 值
     * @return boolean 布尔值
     */
    public boolean set(final String key, Object value) {
        boolean result = false;
        try {
            redisTemplate.opsForValue().set(key, value);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 方法描述: [写入缓存(可以配置过期时间).]</br>
     * 初始作者: Mark.Yao<br/>
     * 创建日期: 2019年9月6日-上午11:47:09<br/>
     * 开始版本: 1.0.0<br/>
     * =================================================<br/>
     * 修改记录：<br/>
     * 修改作者 日期 修改内容<br/>
     * ================================================<br/>
     *
     * @param key        键
     * @param value      值
     * @param expireTime 过期时间
     * @return boolean 布尔值
     */
    public boolean set(final String key, Object value, Long expireTime) {
        boolean result = false;
        try {
            redisTemplate.opsForValue().set(key, value);
            redisTemplate.expire(key, expireTime, TimeUnit.SECONDS);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 方法描述: [通过redis进行自增.]</br>
     * 初始作者: Mark.Yao<br/>
     * 创建日期: 2019年9月6日-上午11:47:09<br/>
     * 开始版本: 1.0.0<br/>
     * =================================================<br/>
     * 修改记录：<br/>
     * 修改作者 日期 修改内容<br/>
     * ================================================<br/>
     *
     * @param key 前缀
     * @return Long 序列号
     */
    public Long getNumber(String key) {
        return this.redisTemplate.opsForValue().increment(key, 1);
    }

    public boolean setStr(final String key, String value, Long expireTime) {
        boolean result = false;
        try {
            stringRedisTemplate.opsForValue().set(key, value);
            stringRedisTemplate.expire(key, expireTime, TimeUnit.SECONDS);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public String getStr(final String key) {
        return stringRedisTemplate.opsForValue().get(key);
    }

    public boolean existStr(final String key) {
        return stringRedisTemplate.hasKey(key);
    }
}