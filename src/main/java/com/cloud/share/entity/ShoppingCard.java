package com.cloud.share.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;

@Data
@TableName("shopping_card")
@ApiModel(value = "ShoppingCard对象", description = "购物卡表")
public class ShoppingCard {

    private static final long serialVersionUID = 1L;

    /**
     * 购物卡id
     */
    @ApiModelProperty(value = "购物卡id")
    @TableId(value = "card_id", type = IdType.ID_WORKER)
    private Long cardId;

    /**
     * 会员id
     */
    @ApiModelProperty(value = "会员id")
    private Long memberId;

    /**
     * 编码
     */
    @ApiModelProperty(value = "编码")
    private String code;

    /**
     * 是否激活
     */
    @ApiModelProperty(value = "是否激活")
    private String isActive;

    /**
     * 兑换次数
     */
    @ApiModelProperty(value = "兑换次数")
    private Integer exchangeTimes;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    @ApiModelProperty(value = "修改时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime modifiedTime;

}
