package com.magic.common.service.impl;

import com.aliyun.oss.ClientBuilderConfiguration;
import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.common.auth.DefaultCredentialProvider;
import com.aliyun.oss.common.comm.SignVersion;
import com.aliyun.oss.model.AsyncProcessObjectRequest;
import com.aliyun.oss.model.AsyncProcessObjectResult;
import com.aliyuncs.exceptions.ClientException;
import com.magic.common.service.AliyunOssService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Base64;

@Service
public class AliyunOssServiceImpl implements AliyunOssService {
    private final String endPoint = "https://oss-cn-hangzhou.aliyuncs.com";

    private final String region = "cn-hangzhou";

    @Value("${oss.accessKey}")
    private String accessKeyId;
    private String key;

    @Value("${oss.secretKey}")
    private String accessKeySecret;
    private String secret;

    @Value("${oss.bucketName}")
    private String bucketName;
    private String bucket;

    @PostConstruct
    private void init() {
        key = accessKeyId;
        secret = accessKeySecret;
        bucket = bucketName;
    }

    @Override
    public void videoTransfer(String sourceKey, String targetKey, String style) throws ClientException {
        DefaultCredentialProvider credentialsProvider = new DefaultCredentialProvider(key, secret);

        // 创建OSSClient实例。
        ClientBuilderConfiguration clientBuilderConfiguration = new ClientBuilderConfiguration();
        clientBuilderConfiguration.setSignatureVersion(SignVersion.V4);
        OSS ossClient = OSSClientBuilder.create()
                .endpoint(endPoint)
                .credentialsProvider(credentialsProvider)
                .clientConfiguration(clientBuilderConfiguration)
                .region(region)
                .build();

        try {
            // 构建异步处理指令。
            String bucketEncoded = Base64.getUrlEncoder().withoutPadding().encodeToString(bucket.getBytes());
            String targetEncoded = Base64.getUrlEncoder().withoutPadding().encodeToString(targetKey.getBytes());
            String process = String.format("%s|sys/saveas,b_%s,o_%s/notify,topic_QXVkaW9Db252ZXJ0", style, bucketEncoded, targetEncoded);
            // 创建AsyncProcessObjectRequest对象。
            AsyncProcessObjectRequest request = new AsyncProcessObjectRequest(bucket, sourceKey, process);
            // 执行异步处理任务。
            AsyncProcessObjectResult response = ossClient.asyncProcessObject(request);
            System.out.println("EventId: " + response.getEventId());
            System.out.println("RequestId: " + response.getRequestId());
            System.out.println("TaskId: " + response.getTaskId());

        } finally {
            // 关闭OSSClient。
            ossClient.shutdown();
        }
    }
}
