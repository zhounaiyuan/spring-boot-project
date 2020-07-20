package com.zcset.platform.server.dao.es;

import com.zcset.platform.server.entity.es.UGRLinkES;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface UGRLinkDao extends ElasticsearchRepository<UGRLinkES, String> {
    @Query("{\"bool\" : {\"must\" : {\"field\" : {\"firstCode.keyword\" : \"?\"}}}}")
    Page<UGRLinkES> findByRoleId(Long userid, Pageable pageable);
}
