package com.magic.module.ai.service.impl;

import com.alibaba.dashscope.exception.ApiException;
import com.alibaba.dashscope.exception.InputRequiredException;
import com.alibaba.dashscope.exception.NoApiKeyException;
import com.magic.module.ai.service.AiService;
import com.alibaba.dashscope.aigc.generation.Generation;
import com.alibaba.dashscope.aigc.generation.GenerationParam;
import com.alibaba.dashscope.common.Message;
import com.alibaba.dashscope.common.Role;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * 参考文档： <a href="https://help.aliyun.com/zh/model-studio/developer-reference/error-code">...</a>
 */
@Slf4j
@Service
public class AiServiceImpl implements AiService {

    @Value("${aliyun.ai.key}")
    public String aiKey;

    /**
     * <ResponseResult>
     * <code>1</code>
     * <msg>请求成功！</msg>
     * <data>
     * <role>assistant</role>
     * <content>恒温花洒真能解决洗澡水忽冷忽热的问题吗？</content>
     * <toolCallId/>
     * <name/>
     * <reasoningContent/>
     * </data>
     * <fail>1</fail>
     * <success>0</success>
     * </ResponseResult>
     * @param systemContent 系统内容
     * @param userContent 用户内容
     * @return xml格式
     */
    @Override
    public Object call(String systemContent, String userContent) {
        Generation gen = new Generation();

        Message systemMsg = Message.builder()
                .role(Role.SYSTEM.getValue())
                .content(systemContent)
                .build();
        Message userMsg = Message.builder()
                .role(Role.USER.getValue())
                .content(userContent)
                .build();
        GenerationParam param = GenerationParam.builder()
                // 若没有配置环境变量，请用百炼API Key将下行替换为：.apiKey("sk-xxx")
                .apiKey(aiKey)
                .model("qwen-plus")
                .messages(Arrays.asList(systemMsg, userMsg))
                .resultFormat(GenerationParam.ResultFormat.MESSAGE)
                .build();

        Object res = null;
        try {
            res = gen.call(param).getOutput().getChoices().get(0).getMessage();
        } catch (ApiException | NoApiKeyException | InputRequiredException e) {
            log.error("{}", e.getMessage());
        }
        return res;
    }
}
