package com.magic.executor;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.XxlJob;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
/*
  使用 @XxlJob 注解，可以不继承 IJobHandler 接口，直接使用 `public ReturnT<String> execute(String param)` 方法即可
  参考教程： https://blog.csdn.net/javaboyweng/article/details/135342674
  执行器的 Bean模式
  对应的`JobHandler`为 `welcome`
 */
public class TextXxlJob extends IJobHandler {
    @XxlJob("welcome")
    public ReturnT<String> execute(String param) throws Exception {
        log.info("XXL-JOB, Hello World. Param: {}", param);
        // 任务逻辑
        // TODO: 在这里编写具体的任务逻辑
        return ReturnT.SUCCESS;
    }
}
