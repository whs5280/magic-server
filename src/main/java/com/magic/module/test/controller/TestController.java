package com.magic.module.test.controller;

import com.google.protobuf.Descriptors;
import com.magic.common.component.ElasticsearchService;
import com.magic.common.response.ResponseResult;
import com.magic.consul.ConsulService;
import com.magic.microservice.encrypt.EncryptService;
import com.magic.microservice.zan.ZanService;
import com.magic.microservice.zan.vo.ZanListVo;
import lombok.extern.slf4j.Slf4j;
import org.elasticsearch.action.search.SearchResponse;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Slf4j
@RequestMapping("/api/test")
@RestController
public class TestController {
    private final ConsulService consulService;
    private final EncryptService encryptService;
    private final ZanService zanService;
    private final ElasticsearchService elasticsearchService;

    @Autowired
    public TestController(ConsulService consulService, EncryptService encryptService, ZanService zanService, ElasticsearchService elasticsearchService)
    {
        this.consulService = consulService;
        this.encryptService = encryptService;
        this.zanService = zanService;
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

    @GetMapping("/addZan")
    public ResponseEntity<?> addZan() throws Exception {
        zanService.addZan(10086, 2, 1);
        return ResponseEntity.ok(ResponseResult.success("add zan success"));
    }

    @GetMapping("/delZan")
    public ResponseEntity<?> delZan() throws Exception {
        zanService.delZan(10086, 1, 1);
        return ResponseEntity.ok(ResponseResult.success("del zan success"));
    }

    @GetMapping("/isZan")
    public ResponseEntity<?> isZan() throws Exception {
        boolean result = zanService.isZan(10086, 1, 1);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/zanCount")
    public ResponseEntity<?> zanCount() throws Exception {
        Map<Descriptors.FieldDescriptor, Object> result = zanService.zanCount(1, 1);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/userZan")
    public ResponseEntity<?> userZan() throws Exception {
        List<Integer> appIds = new ArrayList<>();
        appIds.add(1);
        appIds.add(2);
        ZanListVo result = zanService.UserZanByAppIds(10086, appIds, 1, 10, null);
        return ResponseEntity.ok(result);
    }
}
