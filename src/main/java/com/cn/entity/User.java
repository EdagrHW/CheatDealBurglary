package com.cn.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author huangwei
 * @since 2021-08-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName(value = "user")
public class User extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户头像
     */
    private String avatar;

    /**
     * 实名
     */
    private String name;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 等级
     */
    private Integer level;

    /**
     * 密码
     */
    private Integer password;


}
