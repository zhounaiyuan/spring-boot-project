package com.zcset.platform.server.service;

import com.zcset.platform.server.entity.db.UGRLinkDB;
import com.zcset.platform.server.entity.es.UGRLinkES;
import org.springframework.data.domain.Page;

import java.util.Iterator;
import java.util.List;

public interface UGRLinkService {
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
    void save(UGRLinkES docBean);

    /**
     * @param list 批量保存es中的文档
     */
    void saveAll(List<UGRLinkES> list);

    /**
     * @return 查找所有的文档
     */
    Iterator<UGRLinkES> findAll();

    Page<UGRLinkES> query(Long key);


    public List<UGRLinkDB> getUGRLinkByName(short id);

    public UGRLinkDB getUGRLinkById(short id);

    public int insertUGRLink(UGRLinkDB user);

    public int deleteUGRLink(UGRLinkDB user);

    public int updateUGRLink(UGRLinkDB user);
}
