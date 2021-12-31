package common.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class CommentVo {

    @ApiModelProperty("单据id")
    private Long id;

    @ApiModelProperty("评论")
    private String comment;
}
