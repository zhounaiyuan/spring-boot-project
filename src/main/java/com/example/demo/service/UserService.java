package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.entity.UserExample;
import com.example.demo.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserMapper userMapper;

    //查询
    public List<User> getUserById(short id) {
        UserExample userExample = new UserExample();
        userExample.createCriteria();
        //log.info("");
        return userMapper.selectByExample(userExample);

    }
    //添加
    //@Transactional
    public int insertUser(User user) {
        return userMapper.insert(user);
    }
    //删除
    //@Transactional
    public int deleteUser(User user) {
        return userMapper.deleteByPrimaryKey(user.getUserid());
    }
    //修改
    //@Transactional
    public int updateUser(User user) {
        return userMapper.updateByPrimaryKey(user);
    }
}
