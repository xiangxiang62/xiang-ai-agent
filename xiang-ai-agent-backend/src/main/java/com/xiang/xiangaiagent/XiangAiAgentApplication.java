package com.xiang.xiangaiagent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@EnableAspectJAutoProxy(exposeProxy = true)
@SpringBootApplication
public class XiangAiAgentApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiangAiAgentApplication.class, args);
    }

}
