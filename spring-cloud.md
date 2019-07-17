#spring cloud
####什么是springcloud
``Spring Cloud 是一些框架的集合，它利用Spring Boot开发的便利性，巧妙的简化了分布式基础设施的开发。融合了具有相应功能的框架,来实现对应的功能，例如服务注册、服务发现、配置中心、消息总线、负载均衡、断路由、健康检查数据监控等。``
####Spring Cloud 主要模块介绍
``Eureka 服务注册与发现，用于服务的管理
  Ribbon 基于客户端的负载均衡组件
  Hystrix 容错框架，能够防止服务的雪崩效应
  Fegin Web服务客户端，能够简化Http接口的调用
  Zuul API网关，提供路由转发，请求过滤等功能
  Config 分布式配置管理
  Sleuth 服务追踪
  Stream 构建消息驱动的微服务应用程序的框架
  Bus 消息代理的集群消息总线``
 ####Spring Cloud 版本介绍
 ``Spring Cloud 版本号一改往常数字定义类型，采用伦敦地铁站的名字进命名（相对不好读）参考官网 https://spring.io/projects/spring-cloud#learn 在实际开发中，关注版本号是一件很重要的事情，不同的版本对应的API可能会不同。在使用中Spring Boot 版本要和Spring Cloud 对应以免产生不必要的BUG。``
 
 
 
