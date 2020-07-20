package com.zcset.platform.server.service.impl;

import com.zcset.platform.server.dao.db.UserMapper;
import com.zcset.platform.server.dao.es.ElasticSearchDao;
import com.zcset.platform.server.dao.es.UserDao;
import com.zcset.platform.server.entity.db.UserDB;
import com.zcset.platform.server.entity.db.UserExample;
import com.zcset.platform.server.entity.es.UserES;
import com.zcset.platform.server.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service("userservice")
@Scope("prototype")
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserDao userDao;
    @Autowired
    private ElasticSearchDao esd;

    @Autowired
    private ElasticsearchRestTemplate elasticsearchTemplate;
    private Pageable pageable = PageRequest.of(0, 10);

    @Override
    public void createIndex() {
        elasticsearchTemplate.createIndex(UserES.class);
    }

    @Override
    public void deleteIndex(String index) {
        elasticsearchTemplate.deleteIndex(index);
    }

    @Override
    public void save(UserES docBean) {
        userDao.save(docBean);
    }

    @Override
    public void saveAll(List<UserES> list) {
        userDao.saveAll(list);
    }

    @Override
    public Iterator<UserES> findAll() {
        return userDao.findAll().iterator();
    }

    @Override
    public Page<UserES> findByContent(String content) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Page<UserES> findByFirstCode(String firstCode) {
        // TODO Auto-generated method stub
        return userDao.findByUserName(firstCode, pageable);
    }

    @Override
    public Page<UserES> findBySecordCode(String secordCode) {
        // TODO Auto-generated method stub
        return userDao.findByUserName(secordCode, pageable);
    }

    @Override
    public Page<UserES> query(Long key) {
        // TODO Auto-generated method stub
        return userDao.findByUserId(key, pageable);
    }

///////////////////////////////////////////////////////////////////

    //orc查询
    @Override
    public List<UserDB> getUserByName(String name) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(name);
        //log.info("");
        return userMapper.selectByExample(userExample);

    }

    @Override
    public UserDB getUserById(short id) {
        return userMapper.selectByPrimaryKey((Long) (long) id);
    }

    //orc添加
    //@Transactional
    @Override
    public int insertUser(UserDB user) {
        return userMapper.insert(user);
    }

    //orc删除
    //@Transactional
    @Override
    public int deleteUser(UserDB user) {
        return userMapper.deleteByPrimaryKey(user.getUserId());
    }

    //orc修改
    //@Transactional
    @Override
    public int updateUser(UserDB user) {
        return userMapper.updateByPrimaryKey(user);
    }

    @Override
    public void connectElasticSearch() throws Exception{
        esd.connectElasticSearch();
    }

    @Override
    public void createIndex(String name) throws Exception{
        esd.createIndex();
    }

    @Override
    public void getIndex() throws Exception {
         esd.getSource("E8W0LXMBb9LDuATqBz8Q");
    }

    @Override
    public void closeEs() throws Exception {
        esd.closeElasticSearch();
    }

    @Override
    public void updateIndex(String id) throws Exception {
        esd.updateIndex(id);
    }
    @Override
    public void deleteIndex1(String id) throws Exception {
        esd.deleteIndex(id);
    }
    @Override
    public void searchUserEs(String id) throws Exception {
        esd.searchUserEs(id);
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
