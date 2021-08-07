package com.cn.service.impl;

import com.cn.entity.User;
import com.cn.mapper.UserMapper;
import com.cn.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author huangwei
 * @since 2021-08-07
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
