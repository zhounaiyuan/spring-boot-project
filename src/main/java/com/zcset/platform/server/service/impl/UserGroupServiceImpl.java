package com.zcset.platform.server.service.impl;

import com.zcset.platform.server.dao.db.UserGroupMapper;
import com.zcset.platform.server.dao.es.UserGroupDao;
import com.zcset.platform.server.entity.db.UserGroupDB;
import com.zcset.platform.server.entity.db.UserGroupExample;
import com.zcset.platform.server.entity.es.UserGroupES;
import com.zcset.platform.server.service.UserGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;

import java.util.Iterator;
import java.util.List;

/**
 * @author ：zny
 * @date ：Created in 2020/6/19 17:09
 * @description：用户组服务
 * @modified By：
 * @version: 1.0$
 */
public class UserGroupServiceImpl implements UserGroupService {

    @Autowired
    private UserGroupMapper userGroupMapper;
    @Autowired
    private UserGroupDao userGroupDao;
    @Autowired
    private ElasticsearchRestTemplate elasticsearchTemplate;
    private Pageable pageable = PageRequest.of(0, 10);

    @Override
    public void createIndex() {
        elasticsearchTemplate.createIndex(UserGroupES.class);
    }

    @Override
    public void deleteIndex(String index) {
        elasticsearchTemplate.deleteIndex(index);
    }

    @Override
    public void save(UserGroupES docBean) {
        userGroupDao.save(docBean);
    }

    @Override
    public void saveAll(List<UserGroupES> list) {
        userGroupDao.saveAll(list);
    }

    @Override
    public Iterator<UserGroupES> findAll() {

        return userGroupDao.findAll().iterator();
    }

    @Override
    public Page<UserGroupES> query(Long key) {
        return userGroupDao.findByUserGroupId(key, pageable);
    }

    @Override
    public List<UserGroupDB> getUserGroupByName(String name) {
        UserGroupExample userGroupExample = new UserGroupExample();
        UserGroupExample.Criteria criteria = userGroupExample.createCriteria();
        criteria.andUsergroupnameEqualTo(name);
        //log.info("");
        return userGroupMapper.selectByExample(userGroupExample);
    }

    @Override
    public UserGroupDB getUserGroupById(short id) {
        return userGroupMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insertUserGroup(UserGroupDB user) {
        return userGroupMapper.insert(user);
    }

    @Override
    public int deleteUserGroup(UserGroupDB user) {
        return userGroupMapper.deleteByPrimaryKey(user.getUserGroupId());
    }

    @Override
    public int updateUserGroup(UserGroupDB user) {
        return userGroupMapper.updateByPrimaryKey(user);
    }
}
