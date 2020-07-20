package com.zcset.platform.server.service.impl;

import com.zcset.platform.server.dao.db.URLinkMapper;
import com.zcset.platform.server.dao.es.URLinkDao;
import com.zcset.platform.server.entity.db.URLinkDB;
import com.zcset.platform.server.entity.db.URLinkExample;
import com.zcset.platform.server.entity.es.URLinkES;
import com.zcset.platform.server.service.URLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;

import java.util.Iterator;
import java.util.List;

/**
 * @author ：zny
 * @date ：Created in 2020/6/23 17:13
 * @description：用户与角色关联服务
 * @modified By：
 * @version: 1.0$
 */
public class URLinkServiceImpl implements URLinkService {

    @Autowired
    private URLinkMapper uRLinkMapper;
    @Autowired
    private URLinkDao uRLinkDao;

    @Autowired
    private ElasticsearchRestTemplate elasticsearchTemplate;
    private Pageable pageable = PageRequest.of(0, 10);

    @Override
    public void createIndex() {
        elasticsearchTemplate.createIndex(URLinkES.class);
    }

    @Override
    public void deleteIndex(String index) {
        elasticsearchTemplate.deleteIndex(index);
    }

    @Override
    public void save(URLinkES docBean) {
        uRLinkDao.save(docBean);
    }

    @Override
    public void saveAll(List<URLinkES> list) {
        uRLinkDao.saveAll(list);
    }

    @Override
    public Iterator<URLinkES> findAll() {
        return uRLinkDao.findAll().iterator();
    }

    @Override
    public Page<URLinkES> query(Long key) {
        return uRLinkDao.findByURLinkId(key, pageable);
    }

    @Override
    public List<URLinkDB> getURLinkByName(Long id) {
        URLinkExample userExample = new URLinkExample();
        URLinkExample.Criteria criteria = userExample.createCriteria();
        criteria.andUridEqualTo(id);
        //log.info("");
        return uRLinkMapper.selectByExample(userExample);
    }

    @Override
    public URLinkDB getURLinkById(short id) {
        return uRLinkMapper.selectByPrimaryKey((Long) (long) id);
    }

    @Override
    public int insertURLink(URLinkDB user) {
        return uRLinkMapper.insert(user);
    }

    @Override
    public int deleteURLink(URLinkDB user) {
        return uRLinkMapper.deleteByPrimaryKey(user.getRoleId());
    }

    @Override
    public int updateURLink(URLinkDB user) {
        return uRLinkMapper.updateByPrimaryKey(user);
    }
}
