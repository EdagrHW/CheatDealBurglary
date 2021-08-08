package com.cn.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cn.common.dto.UserDto;
import com.cn.entity.User;
import com.cn.mapper.UserMapper;
import com.cn.service.UserService;
import org.springframework.web.multipart.MultipartFile;

public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Override
    public void AddUser(UserDto userDto) {

    }

    @Override
    public void updateAvatar(String phone, MultipartFile image) {

    }

    @Override
    public void updatePayPassword(String phone, String password) {

    }
}
