package com.wenas.mybatis.plus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>Description: </p>
 * mapper-plus demo
 *
 * @author Wenas
 * @version 1.0.0
 * @date 2019/11/28 23:58
 **/
@SpringBootApplication
@MapperScan("com.wenas.mybatis.plus.mapper")
public class MybatisPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusApplication.class, args);
    }

}
