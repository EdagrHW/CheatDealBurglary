package com.cn.service;

import com.cn.common.dto.UserDto;
import org.springframework.web.multipart.MultipartFile;

/**
 * 用户服务类
 */
public interface UserService {
    /**
     * 创建用户
     * @param userDto
     */
    void AddUser(UserDto userDto);

    /**
     * 更换用户头像
     * @param phone 用户手机号也就是用户账号
     * @param image
     */
    void updateAvatar(String phone, MultipartFile image);

    /**
     * 更换支付密码
     * @param phone
     * @param password
     */
    void updatePayPassword(String phone, String password);

}
