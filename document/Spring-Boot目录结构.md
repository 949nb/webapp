# Spring-Boot 目录结构

| 版本号 | 发布日期   | 主要更新内容 | 修复的问题 | 注意事项                                               |
| ------ | ---------- | ------------ | ---------- | ------------------------------------------------------ |
| 0.0.1  | 2023-02-08 | 初始版本     | 无         | 此版本作为基础版本，未来如果目录修改，会更新这个文件。 |

```
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── example/
│   │           └── myapp/
│   │               ├── controller/  # 存放控制器（Controller）类
│   │               ├── model/       # 存放模型（Model）类，例如JPA实体
│   │               ├── repository/  # 存放数据访问层（Repository或DAO）类
│   │               ├── service/     # 存放服务（Service）类，业务逻辑
│   │               └── MyApplication.java  # Spring Boot应用的启动类
│   ├── resources/
│   │   ├── static/    # 存放静态资源，如HTML、CSS、JavaScript文件
│   │   ├── templates/ # 存放模板文件，如Thymeleaf模板
│   │   ├── application.properties  # 应用程序的配置文件
│   │   └── application.yml  # YAML格式的应用程序配置文件（和properties选用其一）
│   └── webapp/        # 可选，用于存放JSP等Web资源（Spring Boot通常不推荐使用JSP）
└── test/
    ├── java/
    │   └── com/
    │       └── example/
    │           └── myapp/
    │               ├── controller/  # 存放控制器类的测试
    │               ├── service/     # 存放服务类的测试
    │               └── MyApplicationTests.java  # 应用程序的主要测试类
    └── resources/     # 测试时使用的资源文件
```

