package com.xiang.xiangaiagent.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName headCheckController
 * @Description
 * @Author xiangxiang
 * @Date 2025-08-2025/8/1-23:49
 * @Version 1.0
 */
@RestController
@RequestMapping("/health")
public class HeadCheckController {


    /**
     * 健康检查接口
     *
     * @return
     */
    @GetMapping("/")
    public String healthCheck() {
        return "ok";
    }
}
