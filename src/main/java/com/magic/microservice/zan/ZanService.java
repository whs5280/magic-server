package com.magic.microservice.zan;

import com.google.protobuf.Descriptors;
import com.magic.microservice.zan.vo.ZanListVo;
import microservice.protoc.zan.grpc.Request;
import microservice.protoc.zan.grpc.Response;

import java.util.List;
import java.util.Map;

public interface ZanService {
    /**
     * 点赞
     */
    Response.AddZanRep addZan(Integer userId, Integer appId, Integer thirdId) throws Exception;
    /**
     * 取消点赞
     */
    Response.DelZanRep delZan(Integer userId, Integer appId, Integer thirdId) throws Exception;
    /**
     * 点赞状态
     */
    boolean isZan(Integer userId, Integer appId, Integer thirdId) throws Exception;
    /**
     * 点赞数量
     */
    Map<Descriptors.FieldDescriptor, Object> zanCount(Integer appId, Integer thirdId) throws Exception;
    /**
     * 用户点赞数据，支持多个appId查询
     */
    ZanListVo UserZanByAppIds(Integer userId, List<Integer> appIds, Integer page, Integer pageSize, List<Request.SortField> sortField) throws Exception;
}