### xxl-job-admin 使用教程
- docker-compose pull && docker-compose up 启动`xxl-job-admin`容器
- 编写执行器，参考本次提交的代码
- 登录 `http://localhost:8083/xxl-job-admin`, 配置执行器，名称、ip、端口需要跟`XxlJobConfig.java`配置保持一致
- 配置任务调度

![image/xxl/img.png](/images/xxl/img.png)
![image/xxl/img_1.png](/images/xxl/img_1.png)