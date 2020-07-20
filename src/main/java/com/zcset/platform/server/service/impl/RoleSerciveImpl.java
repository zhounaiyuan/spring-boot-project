package com.zcset.platform.server.service.impl;

import com.zcset.platform.server.dao.db.RoleMapper;
import com.zcset.platform.server.dao.es.RoleDao;
import com.zcset.platform.server.entity.db.RoleDB;
import com.zcset.platform.server.entity.db.RoleExample;
import com.zcset.platform.server.entity.es.RoleES;
import com.zcset.platform.server.service.RoleSercive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;

import java.util.Iterator;
import java.util.List;

/**
 * @author ：zny
 * @date ：Created in 2020/6/23 14:41
 * @description：角色类型服务
 * @modified By：
 * @version: 1.0$
 */
public class RoleSerciveImpl implements RoleSercive {

    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private RoleDao roleDao;

    @Autowired
    private ElasticsearchRestTemplate elasticsearchTemplate;
    private Pageable pageable = PageRequest.of(0, 10);

    @Override
    public void createIndex() {
        elasticsearchTemplate.createIndex(RoleES.class);
    }

    @Override
    public void deleteIndex(String index) {
        elasticsearchTemplate.deleteIndex(index);
    }

    @Override
    public void save(RoleES docBean) {
        roleDao.save(docBean);
    }

    @Override
    public void saveAll(List<RoleES> list) {
        roleDao.saveAll(list);
    }

    @Override
    public Iterator<RoleES> findAll() {
        return roleDao.findAll().iterator();
    }

    @Override
    public Page<RoleES> query(Long key) {
        return roleDao.findByRoleId(key, pageable);
    }

    @Override
    public List<RoleDB> getRoleByName(String name) {
        RoleExample userExample = new RoleExample();
        RoleExample.Criteria criteria = userExample.createCriteria();
        criteria.andRolenameEqualTo(name);
        //log.info("");
        return roleMapper.selectByExample(userExample);
    }

    @Override
    public RoleDB getRoleById(short id) {
        return roleMapper.selectByPrimaryKey((Long) (long) id);
    }

    @Override
    public int insertRole(RoleDB user) {
        return roleMapper.insert(user);
    }

    @Override
    public int deleteRole(RoleDB user) {
        return roleMapper.deleteByPrimaryKey(user.getRoleId());
    }

    @Override
    public int updateRole(RoleDB user) {
        return roleMapper.updateByPrimaryKey(user);
    }
}
