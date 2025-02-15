package com.magic.microservice;

import com.ecwid.consul.v1.health.model.HealthService;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 通用客户端
 * 通过consul获取服务节点信息
 */
@Slf4j
@Component
public class Client {
    @Value("${spring.cloud.consul.host}")
    private String serverIp;

    public Object getGrpcBlockingStub(Class<?> classType, HealthService service) throws Exception {
        if (service.getChecks().isEmpty()) {
            throw new Exception("No service node check found");
        }
        if (service.getService().getAddress().isBlank()) {
            throw new Exception("No service node address found");
        }

        // 这里获取的address是内网环境, 公网ip需要在consul配置
        log.info("service address: {}, service port: {}",
                service.getService().getAddress(),
                service.getService().getPort()
        );

        // 创建grpc通道
        ManagedChannel channel = ManagedChannelBuilder.forAddress(
                serverIp != null ? serverIp : service.getService().getAddress(),
                //service.getService().getAddress(),    // .getAddress()获取到的是内网IP，公网IP则需要通过consul配置
                service.getService().getPort()
        ).usePlaintext().build();

        return classType.getDeclaredMethod("newBlockingStub", io.grpc.Channel.class).invoke(null, channel);
    }
}
