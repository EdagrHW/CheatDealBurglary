package com.cn.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 欠条表
 * </p>
 *
 * @author huangwei
 * @since 2021-08-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class IOU implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 欠条金额
     */
    private BigDecimal money;

    /**
     * 还款方式
     */
    private String repaymentWay;

    /**
     * 期数
     */
    private Integer periods;

    /**
     * 每期多少天
     */
    private Integer days;

    /**
     * 欠条用途
     */
    private String use;

    /**
     * 服务费
     */
    private BigDecimal serviceWaste;

    /**
     * 年化利率
     */
    private BigDecimal annualInterestRate;

    /**
     * 利息
     */
    private BigDecimal interest;

    /**
     * 债权人
     */
    private Integer creditorId;

    /**
     * 担保人
     */
    private Integer guarantorId;

    /**
     * 创建时间
     */
    @TableField(value = "createTime", fill = FieldFill.INSERT)
    private LocalDateTime createtime;

    /**
     * 更新时间
     */
    @TableField(value = "updateTime", fill = FieldFill.UPDATE)
    private LocalDateTime updatetime;


}
