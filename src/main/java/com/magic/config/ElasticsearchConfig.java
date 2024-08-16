package com.magic.config;

import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ElasticsearchConfig {
    @Value("${spring.elasticsearch.username}")
    public String username;

    @Value("${spring.elasticsearch.password}")
    public String password;

    @Value("${spring.elasticsearch.uris}")
    public String uris;

    @Bean
    public RestHighLevelClient restHighLevelClient() {
        final CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
        credentialsProvider.setCredentials(AuthScope.ANY, new UsernamePasswordCredentials(username, password));

        return new RestHighLevelClient(
                RestClient.builder(new HttpHost("192.168.31.5", 9200, "http"))
                        .setHttpClientConfigCallback(httpClientBuilder -> httpClientBuilder.setDefaultCredentialsProvider(credentialsProvider))
                        .build()
        );
    }
}
