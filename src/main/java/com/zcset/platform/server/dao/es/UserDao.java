package com.zcset.platform.server.dao.es;

import com.zcset.platform.server.entity.es.UserES;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

@Configuration
public interface UserDao extends ElasticsearchRepository<UserES, String> {

    @Query("{\"bool\" : {\"must\" : {\"field\" : {\"firstCode.keyword\" : \"?\"}}}}")
    Page<UserES> findByUserId(Long userid, Pageable pageable);

    @Query("{\"bool\" : {\"must\" : {\"field\" : {\"secordCode.keyword\" : \"?\"}}}}")
    Page<UserES> findByUserName(String username, Pageable pageable);
}
