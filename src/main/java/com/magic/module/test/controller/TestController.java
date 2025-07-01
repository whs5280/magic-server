package com.magic.module.test.controller;

import com.google.protobuf.Descriptors;
import com.magic.common.component.ElasticsearchService;
import com.magic.common.response.ResponseResult;
import com.magic.consul.ConsulService;
import com.magic.microservice.encrypt.EncryptService;
import com.magic.microservice.zan.ZanService;
import com.magic.microservice.zan.vo.ZanListVo;
import com.magic.module.ai.service.AiService;
import lombok.extern.slf4j.Slf4j;
import org.elasticsearch.action.search.SearchResponse;
import org.json.JSONException;
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
    private final AiService aiService;
    private final ElasticsearchService elasticsearchService;

    @Autowired
    public TestController(ConsulService consulService, EncryptService encryptService, ZanService zanService, ElasticsearchService elasticsearchService, AiService aiService)
    {
        this.consulService = consulService;
        this.encryptService = encryptService;
        this.zanService = zanService;
        this.elasticsearchService = elasticsearchService;
        this.aiService = aiService;
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

    @GetMapping("/ai")
    public ResponseEntity<?> ai() {
        String systemContent = "角色\\n你是app上一位热情且活跃的用户。善于阅读给出的内容，并能从独特视角给出精彩评论，有效引发其他用户的讨论和互动。\\n\\n## 技能\\n### 技能 1: 撰写评论\\n1. 认真且细致地阅读用户提供的装修文章内容，充分理解其中的要点、特色等关键信息。\\n2. 紧密围绕文章内容，从自身丰富的装修认知和使用体验角度出发，撰写一条1兼具吸引力与话题性的评论。\\n3.你的定位是评论家，特长是擅长引起热评\\n\\n## 限制:\\n- 评论内容必须紧密围绕输入的装修文章，不可偏离主题。\\n- 评论字数需严格控制在12左右之间，并且向我提供1条评论";
        String userContent = "<p>我们平时使用的花洒是哪种模式的，大家有注意过吗？为了能让人体验到舒适的沐浴感觉，花洒也在不断的升级，而如今出现的恒温花洒，却赢得了大多数人的青睐，因此当毛坯房家装浴室的过程中，普通花洒和恒温花洒有什么区别？小编为大家盘点！<br/><img src=\"https://aimg.yidoutang.com//prod/common/202304/22/8764da/b1f2cd6ea1944197.png\" class=\"data_7886843\"><br/><strong>普通花洒和恒温花洒区别—普通花洒</strong><br/>普通花洒就是传统花洒，利用陶瓷片调节阀芯，对水温没有控制作用。生活中常会出现一个人洗澡的时候，另一个人使用洗手台的水龙头，洗澡水的水温就会变凉。<br/><img src=\"https://aimg.yidoutang.com//prod/common/202304/22/8764da/602bf54208a79a5e.png\" class=\"data_7886842\"><br/><strong>普通花洒和恒温花洒区别—恒温花洒</strong><br/>恒温花洒顾名思义，能让洗澡水保持恒定温度，只要自己提前设定好水温，每次打开就是一样的温度，不必再担心水温忽冷忽热，让我们拥有更好的卫浴享受。<br/><img src=\"https://aimg.yidoutang.com//prod/common/202304/22/8764da/070015cd7b512d56.png\" class=\"data_7886844\"><br/><strong>普通花洒和恒温花洒区别—对热水器要求高</strong><br/>恒温花洒价格更贵，对热水器的选择也有一定要求。<br/>储水式热水器要求容量在40升以上；<br/>燃气热水器要求容量在13升及以上、温度设定在55-65℃；<br/>空气能热水器要求容量在100升以上；<br/>即热式热水器、壁挂炉、太阳能热水器这些是不可以的。<img src=\"https://aimg.yidoutang.com//prod/common/202304/22/8764da/dbaf135a03591b3b.png\" class=\"data_7886841\"><br/>毛坯房家装浴室，花洒的安装与使用，你会选择恒温花洒还是普通花洒呢？为此，小编表示，花洒是整个卫浴装修中非常重要的一个部分，不管是材质，还是使用感受上，都不能被忽视掉，而且花洒的好与坏也直接影响了沐浴的质量，因此，恒温花洒的确是比较不错的选择！</p>";
        Object result = aiService.call(systemContent, userContent);
        return ResponseEntity.ok(ResponseResult.success(result));
    }

    @GetMapping("/esDemo")
    public ResponseEntity<?> searchQueryBuilder() {
        SearchResponse result = elasticsearchService.searchQueryDemo();
        return ResponseEntity.ok(ResponseResult.success(result.getHits()));
    }

    @GetMapping("/esSearch")
    public ResponseEntity<?> esSearch() throws JSONException {
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
