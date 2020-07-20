package com.zcset.platform.server.dao.es;

import com.zcset.platform.server.entity.es.UserGroupES;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface UserGroupDao extends ElasticsearchRepository<UserGroupES, String> {
    @Query("{\"bool\" : {\"must\" : {\"field\" : {\"firstCode.keyword\" : \"?\"}}}}")
    Page<UserGroupES> findByUserGroupId(Long userid, Pageable pageable);
}

