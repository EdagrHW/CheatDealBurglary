package com.cn.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 借条表
 * </p>
 *
 * @author huangwei
 * @since 2021-08-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UOI extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 借条金额
     */
    private BigDecimal money;

    /**
     * 还款方式
     */
    private String repaymentWay;

    /**
     * 期数
     */
    private Integer repaymentPeriods;

    /**
     * 每期多少天
     */
    private Integer repaymentDays;

    /**
     * 借条用途
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


}