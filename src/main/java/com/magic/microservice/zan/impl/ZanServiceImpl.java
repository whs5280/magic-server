package com.magic.microservice.zan.impl;

import com.alibaba.fastjson.JSON;
import com.aliyun.opensearch.sdk.dependencies.com.google.gson.reflect.TypeToken;
import com.ecwid.consul.v1.health.model.HealthService;
import com.google.protobuf.Descriptors;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import com.magic.consul.ConsulService;
import com.magic.microservice.Client;
import com.magic.microservice.zan.ZanService;
import com.magic.microservice.zan.vo.ZanListVo;
import lombok.extern.slf4j.Slf4j;
import microservice.protoc.zan.grpc.Request;
import microservice.protoc.zan.grpc.Response;
import microservice.protoc.zan.grpc.ZanServiceGrpc;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class ZanServiceImpl implements ZanService {
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
    private static final String SERVICE_NAME = "go-micro-srv-zan";

    public ZanServiceImpl(ConsulService consulService, Client client, @Value("test") String env) throws Exception {
        this.client = client;
        this.healthServiceList = consulService.getServiceAddressList(String.format("%s.%s", env, SERVICE_NAME));
        if (healthServiceList.isEmpty()) {
            log.error("获取服务列表失败");
            throw new Exception("registry is null");
        }
    }

    @Override
    public Response.AddZanRep addZan(Integer userId, Integer appId, Integer thirdId) throws Exception {
        ZanServiceGrpc.ZanServiceBlockingStub blockingStub = (ZanServiceGrpc.ZanServiceBlockingStub) client.getGrpcBlockingStub(ZanServiceGrpc.class, healthServiceList.get(0));
        if (blockingStub != null) {
            return blockingStub.addZan(microservice.protoc.zan.grpc.Request.AddZanReq.newBuilder().
                    setUserId(userId).
                    setAppId(appId).
                    setThirdId(thirdId).
                    setSource(1).
                    build()
            ).getDefaultInstanceForType();
        }
        log.error("zan服务异常");
        throw new Exception("addZan is error");
    }

    @Override
    public Response.DelZanRep delZan(Integer userId, Integer appId, Integer thirdId) throws Exception {
        ZanServiceGrpc.ZanServiceBlockingStub blockingStub = (ZanServiceGrpc.ZanServiceBlockingStub) client.getGrpcBlockingStub(ZanServiceGrpc.class, healthServiceList.get(0));
        if (blockingStub != null) {
            return blockingStub.delZan(microservice.protoc.zan.grpc.Request.DelZanReq.newBuilder().
                    setUserId(userId).
                    setAppId(appId).
                    setThirdId(thirdId).
                    setSource(1).
                    build()
            ).getDefaultInstanceForType();
        }
        log.error("zan服务异常");
        throw new Exception("delZan is error");
    }

    @Override
    public boolean isZan(Integer userId, Integer appId, Integer thirdId) throws Exception {
        ZanServiceGrpc.ZanServiceBlockingStub blockingStub = (ZanServiceGrpc.ZanServiceBlockingStub) client.getGrpcBlockingStub(ZanServiceGrpc.class, healthServiceList.get(0));
        if (blockingStub != null) {
            return blockingStub.isZan(microservice.protoc.zan.grpc.Request.IsZanReq.newBuilder().
                    setUserId(userId).
                    setAppId(appId).
                    setThirdId(thirdId).
                    build()
            ).getIsZan();
        }
        log.error("zan服务异常");
        throw new Exception("isZan is error");
    }

    @Override
    public Map<Descriptors.FieldDescriptor, Object> zanCount(Integer appId, Integer thirdId) throws Exception {
        ZanServiceGrpc.ZanServiceBlockingStub blockingStub = (ZanServiceGrpc.ZanServiceBlockingStub) client.getGrpcBlockingStub(ZanServiceGrpc.class, healthServiceList.get(0));
        if (blockingStub != null) {
            return blockingStub.zanCnt(microservice.protoc.zan.grpc.Request.ZanCntReq.newBuilder().
                    setAppId(appId).
                    setThirdId(thirdId).
                    build()
            ).getAllFields();
        }
        log.error("zan服务异常");
        throw new Exception("zanCount is error");
    }

    @Override
    public ZanListVo UserZanByAppIds(Integer userId, List<Integer> appIds, Integer page, Integer pageSize, List<Request.SortField> sortField) throws Exception {
        ZanServiceGrpc.ZanServiceBlockingStub blockingStub = (ZanServiceGrpc.ZanServiceBlockingStub) client.getGrpcBlockingStub(ZanServiceGrpc.class, healthServiceList.get(0));
        if (blockingStub != null) {
            Request.UserZanByAppIdsReq.Builder query = Request.UserZanByAppIdsReq.newBuilder().setUserId(userId).setPageNum(page).setPageSize(pageSize);
            if (appIds != null) {
                query.addAllAppIds(appIds);
            }
            if (sortField != null) {
                query.addAllSortFields(sortField);
            }
            // 序列化
            Response.UserZanRep result = blockingStub.userZanByAppIds(query.build());
            // 转成字节数组
            byte[] s = result.toByteArray();
            String jsonString = null;
            try {
                //反序列化
                Response.UserZanRep response = Response.UserZanRep.parseFrom(s);
                //转 json
                jsonString = JsonFormat.printer().print(response);
            } catch (InvalidProtocolBufferException e) {
                e.printStackTrace();
            }
            // 将 JSON 字符串转换为对象列表
            Type type = new TypeToken<Map<String, Object>>() {}.getType();
            Map<String, Object> response = JSON.parseObject(jsonString, type);
            Object zanList = response.get("zan");

            return ZanListVo.from(ZanListVo.convertToList(zanList), result.getIsOver());
        }
        return null;
    }
}
