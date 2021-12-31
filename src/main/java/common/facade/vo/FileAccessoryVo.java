package common.facade.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 文件名称： com.socks.zhhc.core.common.facade.vo.FileAccessoryVo.java</br>
 * 初始作者： Mark.Yao</br>
 * 创建日期： 2019年10月4日</br>
 * 功能说明： 公共附件视图 <br/>
 * =================================================<br/>
 * 修改记录：<br/>
 * 修改作者        日期       修改内容<br/>
 * ================================================<br/>
 * Copyright (c) 2019-2020 .All rights reserved.<br/>
 */
@ApiModel("附件视图对象")
@Data
public class FileAccessoryVo implements Serializable {

    /**
     * 字段描述: [序列化编号]
     */
    private static final long serialVersionUID = 1L;

    /**
     * 附件名称
     */
    @ApiModelProperty(value = "附件名称")
    private String enclosuName;

    /**
     * 附件类型
     */
    @ApiModelProperty(value = "附件类型")
    private String enclosutype;

    /**
     * 附件大小
     */
    @ApiModelProperty(value = "附件大小")
    private Long enclosuSize;

    /**
     * 虚拟路径
     */
    @ApiModelProperty(value = "虚拟路径")
    private String virtualPath;

    /**
     * 描述
     */
    @ApiModelProperty(value = "描述")
    private String description;

    /**
     * 上传人
     */
    @ApiModelProperty(value = "上传人")
    private String uploadBy;

    /**
     * 上传日期
     */
    @ApiModelProperty(value = "上传日期")
    private Date uploadDate;
}
