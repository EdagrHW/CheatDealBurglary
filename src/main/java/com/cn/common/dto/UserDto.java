package com.cn.common.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class UserDto {
    /**
     * 用户头像地址
     */
    private String avatar;

    /**
     * 实名
     */
    private String name;

    /**
     * 身份证号码
     */
    private String cardNumber;

    /**
     * 手机号,也就是账号
     */
    private String phone;

    /**
     * 登录密码
     */
    private Integer loginPassword;
}
