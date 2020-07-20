package com.zcset.platform.server.service;

import com.zcset.platform.server.entity.db.RoleDB;
import com.zcset.platform.server.entity.es.RoleES;
import org.springframework.data.domain.Page;

import java.util.Iterator;
import java.util.List;

public interface RoleSercive {
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
    void save(RoleES docBean);

    /**
     * @param list 批量保存es中的文档
     */
    void saveAll(List<RoleES> list);

    /**
     * @return 查找所有的文档
     */
    Iterator<RoleES> findAll();

    Page<RoleES> query(Long key);


    public List<RoleDB> getRoleByName(String name);

    public RoleDB getRoleById(short id);

    public int insertRole(RoleDB user);

    public int deleteRole(RoleDB user);

    public int updateRole(RoleDB user);
}
