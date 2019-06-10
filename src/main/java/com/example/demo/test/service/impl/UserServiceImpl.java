package com.example.demo.test.service.impl;

import com.example.demo.test.entity.User;
import com.example.demo.test.mapper.UserMapper;
import com.example.demo.test.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author kevinwu
 * @since 2019-06-10
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
