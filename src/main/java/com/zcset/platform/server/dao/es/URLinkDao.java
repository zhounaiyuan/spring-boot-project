package com.zcset.platform.server.dao.es;

import com.zcset.platform.server.entity.es.URLinkES;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface URLinkDao extends ElasticsearchRepository<URLinkES, String> {
    @Query("{\"bool\" : {\"must\" : {\"field\" : {\"firstCode.keyword\" : \"?\"}}}}")
    Page<URLinkES> findByURLinkId(Long userid, Pageable pageable);
}
