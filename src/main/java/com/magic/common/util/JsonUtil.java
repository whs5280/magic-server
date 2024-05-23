package com.magic.common.util;

public class JsonUtil {
    /**
     * 将对象转换为json字符串
     * @param object object
     * @return json
     */
    public static String toJson(Object object) {
        return com.alibaba.fastjson.JSON.toJSONString(object);
    }

    /**
     * 将json字符串转换为对象
     * @param json json
     * @param clazz clazz
     * @return object
     * @param <T> 泛型
     */
    public static <T> T toObject(String json, Class<T> clazz) {
        return com.alibaba.fastjson.JSON.parseObject(json, clazz);
    }
}
