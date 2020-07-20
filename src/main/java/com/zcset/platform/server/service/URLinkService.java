package com.zcset.platform.server.service;

import com.zcset.platform.server.entity.db.URLinkDB;
import com.zcset.platform.server.entity.es.URLinkES;
import org.springframework.data.domain.Page;

import java.util.Iterator;
import java.util.List;

public interface URLinkService {
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
    void save(URLinkES docBean);

    /**
     * @param list 批量保存es中的文档
     */
    void saveAll(List<URLinkES> list);

    /**
     * @return 查找所有的文档
     */
    Iterator<URLinkES> findAll();

    Page<URLinkES> query(Long key);


    public List<URLinkDB> getURLinkByName(Long id);

    public URLinkDB getURLinkById(short id);

    public int insertURLink(URLinkDB user);

    public int deleteURLink(URLinkDB user);

    public int updateURLink(URLinkDB user);
}
