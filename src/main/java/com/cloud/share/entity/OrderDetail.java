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
@TableName("order_detail")
@ApiModel(value = "OrderDetail对象", description = "订单信息表")
public class OrderDetail {

    private static final long serialVersionUID = 1L;

    /**
     * 订单id
     */
    @ApiModelProperty(value = "订单id")
    @TableId(value = "order_id", type = IdType.ID_WORKER)
    private Long orderId;

    /**
     * 购物卡id
     */
    @ApiModelProperty(value = "购物卡id")
    private Long cardId;

    /**
     * 收件人
     */
    @ApiModelProperty(value = "收件人")
    private String addressee;

    /**
     * 收件地址
     */
    @ApiModelProperty(value = "收件地址")
    private String address;

    /**
     * 手机号
     */
    @ApiModelProperty(value = "手机号")
    private Long phoneNumber;

    /**
     * 运单号
     */
    @ApiModelProperty(value = "运单号")
    private String trackingNumber;

    /**
     * 订单状态
     */
    @ApiModelProperty(value = "订单状态")
    private String state;

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
