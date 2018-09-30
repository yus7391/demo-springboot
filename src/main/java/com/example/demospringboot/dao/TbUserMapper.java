package com.example.demospringboot.dao;

import com.example.demospringboot.entity.TbUser;

public interface TbUserMapper {
    /**
     * 插入用户
     * @param user
     * @return 插入记录
     */
    int insertUser (TbUser user);

    TbUser selectByPrimaryKey (long id);

    int deleteByPrimaryKey(long id);
}
