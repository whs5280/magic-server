package org.example;

import com.magic.common.util.AesUtil;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import microservice.protoc.encrypt.grpc.EncryptServiceGrpc;

public class Main {
    public static void main(String[] args) {
        // 微服务
        ManagedChannel channel = ManagedChannelBuilder.forAddress("127.0.0.1", 36882)
                .usePlaintext()
                .build();

        EncryptServiceGrpc.EncryptServiceBlockingStub encryptServiceBlockingStub = EncryptServiceGrpc.newBlockingStub(channel);
        String decrypt = encryptServiceBlockingStub.decrypt(microservice.protoc.encrypt.grpc.EncryptServiceClient.Request.newBuilder().setContent("57c6d0e688652930c43e62c86279d76b").build()).getSecretContent();
        System.out.println(decrypt);

        String hash = encryptServiceBlockingStub.getHash(microservice.protoc.encrypt.grpc.EncryptServiceClient.Request.newBuilder().setContent("magic-service").build()).getSecretContent();
        System.out.println(hash);

        String encrypt1 = encryptServiceBlockingStub.encrypt(microservice.protoc.encrypt.grpc.EncryptServiceClient.Request.newBuilder().setContent("magic-service").build()).getSecretContent();
        System.out.println(encrypt1);

        // 加密
        String encrypt = AesUtil.encrypt("89f7b7014063265955fcacc5284f8f41");
        System.out.println(encrypt);
    }
}