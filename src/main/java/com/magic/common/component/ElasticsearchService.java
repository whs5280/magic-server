package com.magic.common.component;

import lombok.extern.slf4j.Slf4j;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Slf4j
@Service
public class ElasticsearchService {
    private final RestHighLevelClient elasticsearchClient;

    private final Environment env;

    @Autowired
    public ElasticsearchService(RestHighLevelClient elasticsearchClient, Environment env) {
        this.elasticsearchClient = elasticsearchClient;
        this.env = env;
    }

    /**
     * 使用QueryBuilder来查询
     * Search documents using a query builder
     */
    public SearchResponse searchQueryDemo() {
        SearchRequest searchRequest = new SearchRequest("ydt_designer_online");
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

        QueryBuilder queryBuilder = QueryBuilders.boolQuery()
                .must(QueryBuilders.matchPhraseQuery("nickname.spname", "幽默"))
                .must(QueryBuilders.termQuery("user_vip", "8"));

        searchSourceBuilder.query(queryBuilder);
        searchRequest.source(searchSourceBuilder);

        SearchResponse searchResponse = null;
        try {
            searchResponse = elasticsearchClient.search(searchRequest);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Error occurred while searching in Elasticsearch: " + e.getMessage());
        }
        return searchResponse;
    }

    /**
     * Search documents using a DSL query
     */
    public String searchWithDSL(String index, String dslQuery) {
        RestTemplate restTemplate = new RestTemplate();

        // 创建请求体对象，这里假设要发送一个JSON格式的请求体
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> requestEntity = new HttpEntity<>(dslQuery, headers);

        // 发送POST请求，并带上请求体
        String url = env.getProperty("spring.elasticsearch.uris") + "/" + index + "/_search";
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);

        if (response.getStatusCode() != HttpStatus.OK) {
            throw new RuntimeException("Error occurred while searching in Elasticsearch: " + response.getStatusCode());
        }
        log.info("Response: {}", response.getBody());
        return response.getBody();
    }
}
