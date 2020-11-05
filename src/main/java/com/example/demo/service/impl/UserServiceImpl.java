package com.example.demo.service.impl;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.UserModel;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：lzz
 * @BelongsProject: com.example.demo.service.impl
 * @date ：Created in 2020/11/5
 * @description ：
 * @modified By：
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserModel> list() {
        return userMapper.selectList(null);
    }
}
