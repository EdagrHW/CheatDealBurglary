package com.cn.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 群借条表
 * </p>
 *
 * @author huangwei
 * @since 2021-08-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class GroupUOI extends BaseEntity implements Serializable {

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
     * 还款日期
     */
    private LocalDateTime repaymentDate;

    /**
     * 资金用途
     */
    private String use;

    /**
     * 还款来源
     */
    private String repaymentSource;

    /**
     * 年化利率
     */
    private BigDecimal annualInterestRate;

}
