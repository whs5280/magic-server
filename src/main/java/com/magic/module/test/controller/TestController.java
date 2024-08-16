package com.magic.module.test.controller;

import com.magic.common.component.ElasticsearchService;
import com.magic.common.response.ResponseResult;
import com.magic.consul.ConsulService;
import com.magic.microservice.encrypt.EncryptService;
import lombok.extern.slf4j.Slf4j;
import org.elasticsearch.action.search.SearchResponse;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RequestMapping("/api/test")
@RestController
public class TestController {
    private final ConsulService consulService;
    private final EncryptService encryptService;

    private final ElasticsearchService elasticsearchService;

    @Autowired
    public TestController(ConsulService consulService, EncryptService encryptService, ElasticsearchService elasticsearchService)
    {
        this.consulService = consulService;
        this.encryptService = encryptService;
        this.elasticsearchService = elasticsearchService;
    }

    @GetMapping("/index")
    public ResponseEntity<?> index(@RequestParam String data) throws Exception {
        if (data.equals("")) {
            return ResponseEntity.ok(ResponseResult.fail("param is null"));
        }
        String encrypt = encryptService.encrypt(data);
        String decrypt = encryptService.decrypt(encrypt);
        return ResponseEntity.ok(ResponseResult.success(encrypt + ":" + decrypt));
    }

    @GetMapping("/services")
    public Object getServices() {
        // 调用ConsulService中的方法与Consul服务进行交互
        return ResponseEntity.ok(ResponseResult.success(consulService.getServiceAddressList("test.ydt.encrypt.service")));
    }

    @GetMapping("/esDemo")
    public ResponseEntity<?> searchQueryBuilder() {
        SearchResponse result = elasticsearchService.searchQueryDemo();
        return ResponseEntity.ok(ResponseResult.success(result.getHits()));
    }

    @GetMapping("/esSearch")
    public ResponseEntity<?> esSearch() {
        String index = "ydt_designer_online";
        String query = "{\"query\":{\"bool\":{\"must\":[{\"match_phrase\":{\"nickname.spname\":\"幽默\"}}]}}}";
        log.info("searchDocuments: index={}, query={}", index, query);

        String result = elasticsearchService.searchWithDSL(index, query);
        JSONObject resultObj = new JSONObject(result);
        return ResponseEntity.ok(ResponseResult.success(resultObj.get("hits")));
    }
}
