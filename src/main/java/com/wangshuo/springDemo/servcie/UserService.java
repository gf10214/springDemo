package com.wangshuo.springDemo.servcie;

import com.wangshuo.springDemo.dao.UserMapper;
import com.wangshuo.springDemo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wangshuo on 2016/9/8 0008.
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public List<User> getUser(){
        return userMapper.getUser();
    }
}
