package com.example.generator.dao;

import com.example.generator.pojo.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
//@Component
@Mapper
public interface OrderMapper {

    @Select("select *from tb_orders")
    public List<Orders> findAllOrders();
}
