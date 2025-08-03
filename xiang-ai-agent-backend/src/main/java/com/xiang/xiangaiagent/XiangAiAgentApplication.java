package com.xiang.xiangaiagent;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@EnableAspectJAutoProxy(exposeProxy = true)
@SpringBootApplication
@MapperScan("com.xiang.xiangaiagent.mapper")
public class XiangAiAgentApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiangAiAgentApplication.class, args);
    }

}
