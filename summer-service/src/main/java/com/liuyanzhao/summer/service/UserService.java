package com.liuyanzhao.summer.service;

import com.liuyanzhao.summer.entity.User;

import java.util.List;


public interface UserService {


    /**
     * 根据用户ID获得用户信息
     * @param id
     * @return
     */
    User getUserById(Integer id);

    /**
     * 根据用户名获得用户信息
     * @param username
     * @return
     */
    User getUserByUsername(String username);

    /**
     * 获得所有的用户
     * @return
     */
    List<User> listUsers();

    /**
     * 根据用户ID删除用户
     * @param id
     */
    void deleteUserById(Integer id);

    /**
     * 更新用户
     * @param user
     */
    void updateUser(User user);

    /**
     * 添加新用户
     * @param user
     */
    void insertUser(User user);


}
