package com.zcset.platform.server.service;

import com.zcset.platform.server.entity.db.UserDB;
import com.zcset.platform.server.entity.es.UserES;
import org.springframework.data.domain.Page;

import java.util.Iterator;
import java.util.List;

public interface UserService {
    /**
     * 创建es中的index
     */
    void createIndex();

    /**
     * @param index 删除es中的index
     */
    void deleteIndex(String index);

    /**
     * @param docBean 保存es中的文档
     */
    void save(UserES docBean);

    /**
     * @param list 批量保存es中的文档
     */
    void saveAll(List<UserES> list);

    /**
     * @return 查找所有的文档
     */
    Iterator<UserES> findAll();

    Page<UserES> findByContent(String content);

    Page<UserES> findByFirstCode(String firstCode);

    Page<UserES> findBySecordCode(String secordCode);

    Page<UserES> query(Long key);


    List<UserDB> getUserByName(String name);

    UserDB getUserById(short id);

    int insertUser(UserDB user);

    int deleteUser(UserDB user);

    int updateUser(UserDB user);

    ////////
    void connectElasticSearch() throws Exception;

    void createIndex(String name) throws Exception;

    void getIndex() throws Exception;

    void closeEs() throws Exception;

    void updateIndex(String id) throws Exception;

    void deleteIndex1(String id) throws Exception;

    void searchUserEs(String id) throws Exception;
}
