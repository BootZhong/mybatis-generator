package com.example.generator;

import com.example.generator.dao.OrderMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisGeneratorApplicationTests {

    @Autowired
    OrderMapper orderMapper;
    @Test
    void contextLoads() {
        System.out.println(orderMapper.findAllOrders());
    }

}
