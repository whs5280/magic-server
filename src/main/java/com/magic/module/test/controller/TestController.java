package com.magic.module.test.controller;

import com.magic.common.response.ResponseResult;
import com.magic.consul.ConsulService;
import com.magic.microservice.encrypt.EncryptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/test")
@RestController
public class TestController {
    private final ConsulService consulService;
    private final EncryptService encryptService;

    @Autowired
    public TestController(ConsulService consulService, EncryptService encryptService)
    {
        this.consulService = consulService;
        this.encryptService = encryptService;
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
}
