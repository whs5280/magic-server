package com.magic.microservice.encrypt;

public interface EncryptService {
    /**
     * 解码
     */
    String decrypt(String data) throws Exception;

    /**
     * 加密
     */
    String encrypt(String data) throws Exception;

    /**
     * 获取 hash
     */
    String getHash(String data) throws Exception;
}
