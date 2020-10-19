package com.example.generator.dao;

import com.example.generator.pojo.CountBook;

public interface CountBookMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CountBook record);

    int insertSelective(CountBook record);

    CountBook selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CountBook record);

    int updateByPrimaryKey(CountBook record);
}