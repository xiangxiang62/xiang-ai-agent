package com.xiang.xiangaiagent.ai;

import com.xiang.xiangaiagent.ai.model.HtmlCodeResult;
import com.xiang.xiangaiagent.ai.model.MultiFileCodeResult;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @ClassName AiCodeGeneratorServiceTest
 * @Description
 * @Author xiangxiang
 * @Date 2025-08-2025/8/11-23:55
 * @Version 1.0
 */
@SpringBootTest
class AiCodeGeneratorServiceTest {

    @Resource
    private AiCodeGeneratorService aiCodeGeneratorService;

    @Test
    void generateHtmlCode() {
        HtmlCodeResult result = aiCodeGeneratorService.generateHtmlCode("做个程序员香香的工作记录小工具，不超过20行代码");
        Assertions.assertNotNull(result);
    }

    @Test
    void generateMultiFileCode() {
        MultiFileCodeResult multiFileCode = aiCodeGeneratorService.generateMultiFileCode("做个程序员香香的留言板");
        Assertions.assertNotNull(multiFileCode);
    }
}

