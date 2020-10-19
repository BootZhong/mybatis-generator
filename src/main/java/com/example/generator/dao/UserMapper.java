package com.example.generator.dao;

import com.example.generator.pojo.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
}