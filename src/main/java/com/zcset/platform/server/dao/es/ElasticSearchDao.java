package com.zcset.platform.server.dao.es;

public interface ElasticSearchDao {
    void connectElasticSearch() throws Exception;

    void closeElasticSearch() throws Exception;

    void createIndex() throws Exception;

    void  getIndex(String id) throws  Exception;

    void  getSource(String id) throws  Exception;

    void  deleteIndex(String id) throws  Exception;

    void  updateIndex(String id) throws  Exception;

    void  searchUserEs(String temp) throws Exception;
}
