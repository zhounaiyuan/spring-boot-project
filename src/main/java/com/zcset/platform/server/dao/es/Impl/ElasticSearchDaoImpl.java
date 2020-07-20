package com.zcset.platform.server.dao.es.Impl;

import com.zcset.platform.server.dao.es.ElasticSearchDao;
import org.apache.http.HttpHost;
import org.elasticsearch.ElasticsearchException;
import org.elasticsearch.action.ActionListener;
import org.elasticsearch.action.delete.DeleteRequest;
import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.update.UpdateRequest;
import org.elasticsearch.action.update.UpdateResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.core.GetSourceRequest;
import org.elasticsearch.client.core.GetSourceResponse;
import org.elasticsearch.common.Strings;
import org.elasticsearch.index.get.GetResult;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.MatchQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.rest.RestStatus;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.fetch.subphase.FetchSourceContext;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ：zny
 * @date ：Created in 2020/6/28 11:31
 * @description：ES工具实现
 * @modified By：
 * @version: 1.0$
 */
@Repository
public class ElasticSearchDaoImpl implements ElasticSearchDao {
    private RestHighLevelClient client;

    public ElasticSearchDaoImpl() {
        client = null;
    }

    @Override
    public void connectElasticSearch() throws Exception {
        client = new RestHighLevelClient(RestClient.builder(new HttpHost("localhost", 9200, "http")));
    }

    @Override
    public void closeElasticSearch() throws Exception {
        client.close();
    }

    @Override
    public void createIndex() throws Exception {
        Map<String, Object> jsonMap = new HashMap<>();
        jsonMap.put("userid", 110);
        jsonMap.put("username", "迪迦");
        jsonMap.put("contact", "123");
        jsonMap.put("qtip", "123");
        jsonMap.put("imagesrc", "");
        jsonMap.put("password", "");
        jsonMap.put("displayname", "");
        jsonMap.put("innername", "");
        jsonMap.put("enabled", "");
        jsonMap.put("usertype", "");
        jsonMap.put("createtime", new Date());
        jsonMap.put("usernumber", "");
        jsonMap.put("status", "");
        IndexRequest indexRequest1 = new IndexRequest("authority").type("user").source(jsonMap);
//        request.routing("routing"); //路由值
//        request.timeout(TimeValue.timeValueSeconds(1)); //设置超时
//        request.timeout("1s"); ////以字符串形式设置超时时间
//        request.setRefreshPolicy(WriteRequest.RefreshPolicy.WAIT_UNTIL); //以WriteRequest.RefreshPolicy实例形式设置刷新策略
//        request.setRefreshPolicy("wait_for");//以字符串形式刷新策略
//        request.version(2); //文档版本
//        request.versionType(VersionType.EXTERNAL); //文档类型
//        request.opType(DocWriteRequest.OpType.CREATE); //操作类型
//        request.opType("create"); //操作类型 可选create或update
//        request.setPipeline("pipeline"); //索引文档之前要执行的摄取管道的名称
        try {
            IndexResponse response = client.index(indexRequest1, RequestOptions.DEFAULT);
        } catch (ElasticsearchException e) {
            if (e.status() == RestStatus.CONFLICT) {
                //引发的异常表明返回了版本冲突错误
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void getIndex(String id) throws Exception {
        GetRequest request = new GetRequest("authority", id);
        request.fetchSourceContext(FetchSourceContext.DO_NOT_FETCH_SOURCE); //禁用源检索，默认情况下启用
        String[] includes = new String[]{"message", "*Date"};
        String[] excludes = Strings.EMPTY_ARRAY;
        FetchSourceContext fetchSourceContext = new FetchSourceContext(true, includes, excludes);
        request.fetchSourceContext(fetchSourceContext); //为特定字段配置源包含
//            String[] includes = Strings.EMPTY_ARRAY;
//            String[] excludes = new String[]{"message"};
//            FetchSourceContext fetchSourceContext =
//                    new FetchSourceContext(true, includes, excludes);
//            request.fetchSourceContext(fetchSourceContext); //为特定字段配置源排除
        request.storedFields("message"); //配置特定存储字段的检索(要求字段在映射中单独存储)
        GetResponse getResponse = client.get(request, RequestOptions.DEFAULT);
        Map<String, Object> source = getResponse.getSource();
        String message = getResponse.getField("message").getValue(); //检索消息存储字段(要求该字段单独存储在映射中)
    }

    @Override
    public void getSource(String id) throws Exception {
        GetSourceRequest getSourceRequest = new GetSourceRequest("authority", id);
        String[] includes = Strings.EMPTY_ARRAY;
        String[] excludes = new String[]{"postDate"};
        getSourceRequest.fetchSourceContext(
                new FetchSourceContext(true, includes, excludes));
        GetSourceResponse response =
                client.getSource(getSourceRequest, RequestOptions.DEFAULT);
        Map<String, Object> source = response.getSource();
    }

    @Override
    public void deleteIndex(String id) throws Exception {
        DeleteRequest request = new DeleteRequest("authority", id);
        try {
            DeleteResponse deleteResponse = client.delete(
                    new DeleteRequest("posts", "1").setIfSeqNo(100).setIfPrimaryTerm(2),
                    RequestOptions.DEFAULT);
        } catch (ElasticsearchException exception) {
            if (exception.status() == RestStatus.CONFLICT) {

            }
        }
    }

    @Override
    public void updateIndex(String id) throws Exception {

        Map<String, Object> jsonMap = new HashMap<>();
        jsonMap.put("username", "奥特曼");
        UpdateRequest request = new UpdateRequest("authority", id).doc(jsonMap);
        //异步
        ActionListener<UpdateResponse> listener = new ActionListener<UpdateResponse>() {
            @Override
            public void onResponse(UpdateResponse updateResponse) {
                //成功的时候调用
                GetResult result = updateResponse.getGetResult();
                if (result.isExists()) {
                    String sourceAsString = result.sourceAsString();
                    Map<String, Object> sourceAsMap = result.sourceAsMap();
                    byte[] sourceAsBytes = result.source();
                } else {
                    //失败的时候调用
                }
            }

            @Override
            public void onFailure(Exception e) {

            }
        };
        client.updateAsync(request, RequestOptions.DEFAULT, listener);
        //UpdateResponse updateResponse = client.update(request, RequestOptions.DEFAULT);


    }

    @Override
    public void searchUserEs(String temp) throws Exception {

        SearchSourceBuilder sourceBuilder = new SearchSourceBuilder();
        sourceBuilder.size(10);
        MatchQueryBuilder matchQueryBuilder = QueryBuilders.matchQuery("username", "迪");
        BoolQueryBuilder boolq = QueryBuilders.boolQuery();
        boolq.must(matchQueryBuilder);
        sourceBuilder.query(boolq);
        SearchRequest searchRequest = new SearchRequest("authority");
        searchRequest.source(sourceBuilder);
        SearchResponse response = client.search(searchRequest, RequestOptions.DEFAULT);
        SearchHit[] sh = response.getHits().getHits();
        for (int i = 0; i < sh.length; i++) {
            Map<String, Object> map = sh[i].getSourceAsMap();
            for (String key : map.keySet()) {
                System.out.print(key + "=" + map.get(key) + ",");
            }
            System.out.println();
        }
    }
}