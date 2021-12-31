package common.facade.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 文件名称： com.socks.zhhc.core.common.facade.vo.FileDownloadParam.java</br>
 * 初始作者： Mark.Yao</br>
 * 创建日期： 2019年10月24日</br>
 * 功能说明： 文件下载公共入参实体 <br/>
 * =================================================<br/>
 * 修改记录：<br/>
 * 修改作者        日期       修改内容<br/>
 * ================================================<br/>
 * Copyright (c) 2019-2020 .All rights reserved.<br/>
 */
@ApiModel("文件下载入参对象")
@Data
public class FileDownloadParam implements Serializable {

    /**
     * 字段描述: [序列化编号]
     */
    private static final long serialVersionUID = 1L;


    /**
     * 路径
     */
    @ApiModelProperty(value = "文件虚拟路径", required = true)
    private String path;

    /**
     * 文件名
     */
    @ApiModelProperty(value = "文件名", required = true)
    private String fileName;

}
