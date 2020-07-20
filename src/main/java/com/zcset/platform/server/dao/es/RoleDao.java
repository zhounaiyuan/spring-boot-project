package com.zcset.platform.server.dao.es;

import com.zcset.platform.server.entity.es.RoleES;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface RoleDao extends ElasticsearchRepository<RoleES, String> {
    @Query("{\"bool\" : {\"must\" : {\"field\" : {\"firstCode.keyword\" : \"?\"}}}}")
    Page<RoleES> findByRoleId(Long userid, Pageable pageable);
}
