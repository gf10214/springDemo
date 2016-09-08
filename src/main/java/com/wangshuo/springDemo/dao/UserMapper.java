package com.wangshuo.springDemo.dao;

import com.wangshuo.springDemo.entity.User;

import java.util.List;
public interface UserMapper {
    List<User> getUser();
}