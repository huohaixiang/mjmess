/*
* UserDao.java
* Copyright(C) 2017-2020 fendo公司
* @date 2017-12-04
*/
package com.fendo.test;

import com.fendo.test.User;

public interface UserDao {
    /**
     *  根据主键删除数据库的记录:user
     *
     * @param id
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *  新写入数据库记录:user
     *
     * @param fendo
     */
    int insert(User fendo);

    /**
     *  动态字段,写入数据库记录:user
     *
     * @param fendo
     */
    int insertSelective(User fendo);

    /**
     *  根据指定主键获取一条数据库记录:user
     *
     * @param id
     */
    User selectByPrimaryKey(Integer id);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录:user
     *
     * @param record
     */
    int updateByPrimaryKeySelective(User record);
}