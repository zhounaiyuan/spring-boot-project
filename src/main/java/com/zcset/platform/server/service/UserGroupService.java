package com.zcset.platform.server.service;

import com.zcset.platform.server.entity.db.UserGroupDB;
import com.zcset.platform.server.entity.es.UserGroupES;
import org.springframework.data.domain.Page;

import java.util.Iterator;
import java.util.List;

public interface UserGroupService {
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
    void save(UserGroupES docBean);

    /**
     * @param list 批量保存es中的文档
     */
    void saveAll(List<UserGroupES> list);

    /**
     * @return 查找所有的文档
     */
    Iterator<UserGroupES> findAll();

    Page<UserGroupES> query(Long key);


    public List<UserGroupDB> getUserGroupByName(String name);

    public UserGroupDB getUserGroupById(short id);

    public int insertUserGroup(UserGroupDB user);

    public int deleteUserGroup(UserGroupDB user);

    public int updateUserGroup(UserGroupDB user);
}
