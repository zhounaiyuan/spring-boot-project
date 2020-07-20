package com.zcset.platform.server.service.impl;

import com.zcset.platform.server.dao.db.UUGLinkMapper;
import com.zcset.platform.server.dao.es.UUGLinkDao;
import com.zcset.platform.server.entity.db.UUGLinkDB;
import com.zcset.platform.server.entity.db.UUGLinkExample;
import com.zcset.platform.server.entity.es.UUGLinkES;
import com.zcset.platform.server.service.UUGLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;

import java.util.Iterator;
import java.util.List;

/**
 * @author ：zny
 * @date ：Created in 2020/6/23 11:11
 * @description：用户与用户组关联表服务
 * @modified By：
 * @version: 1.0$
 */
public class UUGLinkServiceImpl implements UUGLinkService {

    @Autowired
    private UUGLinkMapper uUGLinkMapper;
    @Autowired
    private UUGLinkDao uUGLinkDao;

    @Autowired
    private ElasticsearchRestTemplate elasticsearchTemplate;
    private Pageable pageable = PageRequest.of(0, 10);

    @Override
    public void createIndex() {
        elasticsearchTemplate.createIndex(UUGLinkES.class);
    }

    @Override
    public void deleteIndex(String index) {
        elasticsearchTemplate.deleteIndex(index);
    }

    @Override
    public void save(UUGLinkES docBean) {
        uUGLinkDao.save(docBean);
    }

    @Override
    public void saveAll(List<UUGLinkES> list) {
        uUGLinkDao.saveAll(list);
    }

    @Override
    public Iterator<UUGLinkES> findAll() {
        return uUGLinkDao.findAll().iterator();
    }

    @Override
    public Page<UUGLinkES> query(Long key) {
        return null;
    }

    @Override
    public List<UUGLinkDB> getUUGLinkByName(short Value) {
        UUGLinkExample userExample = new UUGLinkExample();
        UUGLinkExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsergroupidEqualTo(Value);
        //log.info("");
        return uUGLinkMapper.selectByExample(userExample);
    }

    @Override
    public UUGLinkDB getUUGLinkById(short id) {
        return uUGLinkMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insertUUGLink(UUGLinkDB user) {
        return uUGLinkMapper.insert(user);
    }

    @Override
    public int deleteUUGLink(UUGLinkDB user) {
        return uUGLinkMapper.deleteByPrimaryKey(user.getUugId());
    }

    @Override
    public int updateUUGLink(UUGLinkDB user) {
        return uUGLinkMapper.updateByPrimaryKey(user);
    }
}
