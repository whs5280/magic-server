package com.magic.common.service;

import com.aliyuncs.exceptions.ClientException;

public interface AliyunOssService {
    void videoTransfer(String sourceKey, String targetKey, String style) throws ClientException;
}
