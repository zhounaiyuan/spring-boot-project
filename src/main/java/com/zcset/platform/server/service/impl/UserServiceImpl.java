package com.zcset.platform.server.service.impl;

import com.zcset.platform.server.entity.User;
import com.zcset.platform.server.entity.UserExample;
import com.zcset.platform.server.dao.UserDao;
import com.zcset.platform.server.mapper.UserMapper;
import com.zcset.platform.server.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.MatchQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service("userservice")
@Scope("prototype")
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserDao elasticRepository;

    @Autowired
    private ElasticsearchRestTemplate elasticsearchTemplate;
    private Pageable pageable = PageRequest.of(0, 10);
    @Override
    public void createIndex()
    {
        elasticsearchTemplate.createIndex(User.class);
    }

    @Override
    public void deleteIndex(String index)
    {
        elasticsearchTemplate.deleteIndex(index);
    }

    @Override
    public void save(User docBean)
    {
        elasticRepository.save(docBean);
    }

    @Override
    public void saveAll(List<User> list)
    {
        elasticRepository.saveAll(list);
    }

    @Override
    public Iterator<User> findAll()
    {
        return elasticRepository.findAll().iterator();
    }

    @Override
    public Page<User> findByContent(String content)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Page<User> findByFirstCode(String firstCode)
    {
        // TODO Auto-generated method stub
        return elasticRepository.findByUserName(firstCode,pageable);
    }

    @Override
    public Page<User> findBySecordCode(String secordCode)
    {
        // TODO Auto-generated method stub
        return elasticRepository.findByUserName(secordCode, pageable);
    }

    @Override
    public Page<User> query(Long key)
    {
        // TODO Auto-generated method stub
        return elasticRepository.findByUserId(key, pageable);
    }

///////////////////////////////////////////////////////////////////

    //orc查询
    @Override
    public List<User> getUserById(short id) {
        UserExample userExample = new UserExample();
        userExample.createCriteria();
        //log.info("");
        return userMapper.selectByExample(userExample);

    }
    //orc添加
    //@Transactional
    @Override
    public int insertUser(User user) {
        return userMapper.insert(user);
    }
    //orc删除
    //@Transactional
    @Override
    public int deleteUser(User user) {
        return userMapper.deleteByPrimaryKey(user.getUserid());
    }
    //orc修改
    //@Transactional
    @Override
    public int updateUser(User user) {
        return userMapper.updateByPrimaryKey(user);
    }

//    //elasticSearch查询
//    public Optional<User> getUserById(String id){
//        Optional<User> user = userDao.findById(id);
//        return user;
//    }
//    //elasticSearch添加
//    public User addUser(User user){
//        User nUser = userDao.save(user);
//        return nUser;
//    }
//    //elasticSearch删除
//    public void DeleteUser(User user){
//        userDao.delete(user);
//    }
//    //elasticSearch查询
//    public Page<User> searchUser(String KeyWord, Pageable pageable){
//        BoolQueryBuilder boolQueryBuilder = QueryBuilders.boolQuery();
//        if (!KeyWord.isEmpty()){
//            MatchQueryBuilder matchQueryBuilder =QueryBuilders.matchQuery("username",KeyWord);
//            boolQueryBuilder.must(matchQueryBuilder);
//        }
//        Page<User> page = userDao.search(boolQueryBuilder, pageable);
//        return page;
//    }





}
