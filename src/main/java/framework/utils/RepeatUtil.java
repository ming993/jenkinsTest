package framework.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.List;
import java.util.Objects;

/**
 * 文件名称： com.ev.framework.utils.RepeatUtil.java</br>
 * 初始作者： AirOrangeWorkSpace</br>
 * 创建日期： 2020/5/21 12:54</br>
 * 功能说明： 检查重复值 <br/>
 * =================================================<br/>
 * 修改记录：<br/>
 * 修改作者        日期       修改内容<br/>
 * ================================================<br/>
 * Copyright (c) 2020-2021 .All rights reserved.<br/>
 */
public class RepeatUtil {

    public static boolean checkRepeatColumn(List<?> list, Long id) {
        if (id != null) {
            if (list.size() == 0) {
                return false;
            }
            List<JSONObject> jsonObjects = JSON.parseArray(JSON.toJSONString(list), JSONObject.class);
            jsonObjects.removeIf(e -> Objects.equals(e.getLong("id"), id));
            return jsonObjects.size() > 0;
        }
        return list.size() > 0;
    }
}
