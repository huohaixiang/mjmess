/*
* User.java
* Copyright(C) 2017-2020 fendo公司
* @date 2017-12-04
*/
package com.fendo.test;

/**
 * @Title user表的实体类
 * @Description 
 * @version 1.0
 * @Author fendo
 * @Date 2017-12-04 14:36:37
 */
public class User {
    /**
     * @Fields id 
     */
    private Integer id;

    /**
     * @Fields name 
     */
    private String name;

    /**
     * 获取  字段:user.id
     *
     * @return user.id, 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置  字段:user.id
     *
     * @param id the value for user.id, 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取  字段:user.name
     *
     * @return user.name, 
     */
    public String getName() {
        return name;
    }

    /**
     * 设置  字段:user.name
     *
     * @param name the value for user.name, 
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}