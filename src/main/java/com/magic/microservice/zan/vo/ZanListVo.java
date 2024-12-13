package com.magic.microservice.zan.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import microservice.protoc.zan.grpc.Zan;

import java.util.ArrayList;
import java.util.List;

public class ZanListVo {
    // 用户点赞数据列表，类型为 List<ModelZan>
    @JsonProperty("zan")
    private List<Zan.ModelZan> zan;

    // 是否存在下一页，类型为 boolean
    @JsonProperty("isOver")
    private boolean isOver;

    public List<Zan.ModelZan> getZan() {
        return zan;
    }

    public void setZan(List<Zan.ModelZan> zan) {
        this.zan = zan;
    }

    public boolean isOver() {
        return isOver;
    }

    public void setOver(boolean over) {
        isOver = over;
    }

    /**
     * 构建 ZanListVo 对象
     */
    public static ZanListVo from(List<Zan.ModelZan> zan, boolean isOver) {
        ZanListVo zanListVo = new ZanListVo();
        zanListVo.setZan(zan);
        zanListVo.setOver(isOver);
        return zanListVo;
    }

    /**
     * 将对象转换为 List 类型
     */
    @SuppressWarnings("unchecked")
    public static <T> List<T> convertToList(Object obj) {
        if (obj instanceof List<?>) {
            return (List<T>) obj;
        } else {
            // 如果类型不匹配，可以返回空列表或者抛出异常，视情况而定
            return new ArrayList<>();
        }
    }
}
