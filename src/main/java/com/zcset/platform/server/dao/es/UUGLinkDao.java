package com.zcset.platform.server.dao.es;

import com.zcset.platform.server.entity.es.UUGLinkES;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface UUGLinkDao extends ElasticsearchRepository<UUGLinkES, String> {
    @Query("{\"bool\" : {\"must\" : {\"field\" : {\"firstCode.keyword\" : \"?\"}}}}")
    Page<UUGLinkES> findByUserGroupId(Long userid, Pageable pageable);
}
