package com.magic.consul;

import com.ecwid.consul.v1.ConsulClient;
import com.ecwid.consul.v1.health.model.HealthService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ConsulService {
    private final ConsulClient consulClient;

    @Autowired
    public ConsulService(@Value("${spring.cloud.consul.host}") String consulHost, @Value("${spring.cloud.consul.port}") String consulPort) {
        this.consulClient = new ConsulClient(consulHost, Integer.parseInt(consulPort));
    }

    /**
     * 根据服务名称获取服务列表
     */
    public List<HealthService> getServiceAddressList(String serviceName) {
        return consulClient.getHealthServices(serviceName, true, null).getValue();
    }
}
