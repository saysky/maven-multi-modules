package com.liuyanzhao.summer.mapper;

import com.liuyanzhao.summer.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component("userMapper")
public interface UserMapper {

    int deleteByPrimaryKey(Integer id);

    @Deprecated
    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    @Deprecated
    int updateByPrimaryKey(User record);

    List<User> selectAllUser();

    User selectByUsername(@Param("username") String username);
}