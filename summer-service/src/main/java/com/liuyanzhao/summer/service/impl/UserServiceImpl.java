package com.liuyanzhao.summer.service.impl;

import com.liuyanzhao.summer.mapper.UserMapper;
import com.liuyanzhao.summer.entity.User;
import com.liuyanzhao.summer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public User getUserById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public User getUserByUsername(String username) {
        return userMapper.selectByUsername(username);
    }

    @Override
    public List<User> listUsers() {
        return userMapper.selectAllUser();
    }

    @Transactional
    @Override
    public void deleteUserById(Integer id) {
        userMapper.deleteByPrimaryKey(id);
    }

    @Transactional
    @Override
    public void updateUser(User user) {
        userMapper.updateByPrimaryKeySelective(user);
    }

    @Transactional
    @Override
    public void insertUser(User user) {
        userMapper.insertSelective(user);
    }
}
