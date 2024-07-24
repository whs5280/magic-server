package com.magic.microservice.encrypt.impl;

import com.ecwid.consul.v1.health.model.HealthService;
import com.magic.consul.ConsulService;
import com.magic.microservice.Client;
import com.magic.microservice.encrypt.EncryptService;
import lombok.extern.slf4j.Slf4j;
import microservice.protoc.encrypt.grpc.EncryptServiceGrpc;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class EncryptServiceImpl implements EncryptService {
    /**
     * 客户端
     */
    private final Client client;

    /**
     * 服务节点
     */
    private final List<HealthService> healthServiceList;

    /**
     * 服务名称
     */
    private static final String SERVICE_NAME = "ydt.encrypt.service";

    public EncryptServiceImpl(ConsulService consulService, Client client, @Value("${ENV}") String env) throws Exception {
        this.client = client;
        this.healthServiceList = consulService.getServiceAddressList(String.format("%s.%s", env, SERVICE_NAME));
        if (healthServiceList.isEmpty()) {
            log.error("获取服务列表失败");
            throw new Exception("registry is null");
        }
    }

    @Override
    public String decrypt(String data) throws Exception {
        EncryptServiceGrpc.EncryptServiceBlockingStub encryptServiceBlockingStub= (EncryptServiceGrpc.EncryptServiceBlockingStub) client.getGrpcBlockingStub(EncryptServiceGrpc.class, healthServiceList.get(0));
        if (encryptServiceBlockingStub != null) {
            return encryptServiceBlockingStub.decrypt(microservice.protoc.encrypt.grpc.EncryptServiceClient.Request.newBuilder().setContent(data).build()).getSecretContent();
        }
        log.error("decrypt服务异常");
        throw new Exception("decrypt is error");
    }

    @Override
    public String encrypt(String data) throws Exception {
        EncryptServiceGrpc.EncryptServiceBlockingStub encryptServiceBlockingStub= (EncryptServiceGrpc.EncryptServiceBlockingStub) client.getGrpcBlockingStub(EncryptServiceGrpc.class, healthServiceList.get(0));
        if (encryptServiceBlockingStub != null) {
            return encryptServiceBlockingStub.encrypt(microservice.protoc.encrypt.grpc.EncryptServiceClient.Request.newBuilder().setContent(data).build()).getSecretContent();
        }
        log.error("encrypt服务异常");
        throw new Exception("encrypt is error");
    }

    @Override
    public String getHash(String data) throws Exception {
        EncryptServiceGrpc.EncryptServiceBlockingStub encryptServiceBlockingStub= (EncryptServiceGrpc.EncryptServiceBlockingStub) client.getGrpcBlockingStub(EncryptServiceGrpc.class, healthServiceList.get(0));
        if (encryptServiceBlockingStub != null) {
            return encryptServiceBlockingStub.getHash(microservice.protoc.encrypt.grpc.EncryptServiceClient.Request.newBuilder().setContent(data).build()).getSecretContent();
        }
        log.error("getHash服务异常");
        throw new Exception("getHash is error");
    }
}
