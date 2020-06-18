package com.zcset.platform.server.service;

import com.zcset.platform.server.entity.User;
import org.springframework.data.domain.Page;

import java.util.Iterator;
import java.util.List;

public interface UserService {
    void createIndex();
    void deleteIndex(String index);
    void save(User docBean);
    void saveAll(List<User> list);
    Iterator<User> findAll();
    Page<User> findByContent(String content);
    Page<User> findByFirstCode(String firstCode);
    Page<User> findBySecordCode(String secordCode);
    Page<User> query(Long key);

    public List<User> getUserByName(String name);
    public User getUserById(short id);
    public int insertUser(User user);
    public int deleteUser(User user);
    public int updateUser(User user);
}
