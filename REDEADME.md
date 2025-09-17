### xxl-job-admin 使用教程
- 导入对应的数据表，可以参考 [sql详情](src/main/resources/mysql)
- 登录账号密码为 admin 123456
- docker-compose pull && docker-compose up 启动`xxl-job-admin`容器
- 编写执行器，参考本次提交的代码
- 登录 `http://localhost:8083/xxl-job-admin`, 配置执行器，名称、ip、端口需要跟`XxlJobConfig.java`[配置](src/main/resources/magic-server.yml) 保持一致 
- 配置任务调度

![image/xxl/img.png](/images/xxl/img.png)
![image/xxl/img_1.png](/images/xxl/img_1.png)

### SpringBoot整合RabbitMQ实现消息延迟队列
- RabbitMQConfig [配置](src/main/java/com/magic/config/RabbitMQConfig.java)
- 延迟消息发送者 [Sender](src/main/java/com/magic/common/component/MQDelayMessageSender.java)
- 延迟消息消费者 [Consumer](src/main/java/com/magic/common/amqp/MQDelayMessageListener.java)
- 具体教程：https://zhuanlan.zhihu.com/p/641458427

### 微服务Grpc调用
- [Here](src/main/microservice/README.MD)