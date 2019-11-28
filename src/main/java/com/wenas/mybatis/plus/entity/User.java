package com.wenas.mybatis.plus.entity;

import lombok.Data;

/**
 * <p>Description: </p>
 * 用户测试实体类
 *
 * @author Wenas
 * @version 1.0.0
 * @date 2019/11/29 0:01
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
