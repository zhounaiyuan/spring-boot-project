package com.zcset.platform.server.service.impl;

import com.zcset.platform.server.dao.db.UGRLinkMapper;
import com.zcset.platform.server.dao.es.UGRLinkDao;
import com.zcset.platform.server.entity.db.UGRLinkDB;
import com.zcset.platform.server.entity.db.UGRLinkExample;
import com.zcset.platform.server.entity.es.UGRLinkES;
import com.zcset.platform.server.service.UGRLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;

import java.util.Iterator;
import java.util.List;

/**
 * @author ：zny
 * @date ：Created in 2020/6/23 17:39
 * @description：用户组与角色关联服务
 * @modified By：
 * @version: 1.0$
 */
public class UGRLinkServiceImpl implements UGRLinkService {

    @Autowired
    private UGRLinkMapper uGRLinkMapper;
    @Autowired
    private UGRLinkDao uGRLinkDao;

    @Autowired
    private ElasticsearchRestTemplate elasticsearchTemplate;
    private Pageable pageable = PageRequest.of(0, 10);

    @Override
    public void createIndex() {
        elasticsearchTemplate.createIndex(UGRLinkES.class);
    }

    @Override
    public void deleteIndex(String index) {
        elasticsearchTemplate.deleteIndex(index);
    }

    @Override
    public void save(UGRLinkES docBean) {
        uGRLinkDao.save(docBean);
    }

    @Override
    public void saveAll(List<UGRLinkES> list) {
        uGRLinkDao.saveAll(list);
    }

    @Override
    public Iterator<UGRLinkES> findAll() {
        return uGRLinkDao.findAll().iterator();
    }

    @Override
    public Page<UGRLinkES> query(Long key) {
        return uGRLinkDao.findByRoleId(key, pageable);
    }

    @Override
    public List<UGRLinkDB> getUGRLinkByName(short id) {
        UGRLinkExample userExample = new UGRLinkExample();
        UGRLinkExample.Criteria criteria = userExample.createCriteria();
        criteria.andUgridEqualTo(id);
        //log.info("");
        return uGRLinkMapper.selectByExample(userExample);
    }

    @Override
    public UGRLinkDB getUGRLinkById(short id) {
        return uGRLinkMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insertUGRLink(UGRLinkDB user) {
        return uGRLinkMapper.insert(user);
    }

    @Override
    public int deleteUGRLink(UGRLinkDB user) {
        return uGRLinkMapper.deleteByPrimaryKey(user.getRoleId());
    }

    @Override
    public int updateUGRLink(UGRLinkDB user) {
        return uGRLinkMapper.updateByPrimaryKey(user);
    }
}
