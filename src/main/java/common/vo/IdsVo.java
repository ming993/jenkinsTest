package common.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 初始作者： 尹恒星</br>
 * 创建日期： 2019/11/9 17:05</br>
 * 功能说明： 【根据id批量删除试用】 <br/>
 * =================================================<br/>
 * 修改记录：<br/>
 * 修改作者 日期 修改内容<br/>
 * ================================================<br/>
 * Copyright (c) 2019-2020 .All rights reserved.<br/>
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel("ids参数")
public class IdsVo  {

    private static final long serialVersionUID = 1L;

    /**
     * 主键list
     */
    @ApiModelProperty("主键list")
    private List<Long> ids;
}
