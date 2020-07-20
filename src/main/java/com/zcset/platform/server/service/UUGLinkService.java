package com.zcset.platform.server.service;

import com.zcset.platform.server.entity.db.UUGLinkDB;
import com.zcset.platform.server.entity.es.UUGLinkES;
import org.springframework.data.domain.Page;

import java.util.Iterator;
import java.util.List;

public interface UUGLinkService {
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
    void save(UUGLinkES docBean);

    /**
     * @param list 批量保存es中的文档
     */
    void saveAll(List<UUGLinkES> list);

    /**
     * @return 查找所有的文档
     */
    Iterator<UUGLinkES> findAll();

    Page<UUGLinkES> query(Long key);

    /**
     * @param value 用户组id
     * @return 所有与该用户组关联的用户关联信息
     */
    public List<UUGLinkDB> getUUGLinkByName(short value);

    public UUGLinkDB getUUGLinkById(short id);

    public int insertUUGLink(UUGLinkDB user);

    public int deleteUUGLink(UUGLinkDB user);

    public int updateUUGLink(UUGLinkDB user);

}
