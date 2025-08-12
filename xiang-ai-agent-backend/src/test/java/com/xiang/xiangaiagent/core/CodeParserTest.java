package com.xiang.xiangaiagent.core;

import com.xiang.xiangaiagent.ai.model.HtmlCodeResult;
import com.xiang.xiangaiagent.ai.model.MultiFileCodeResult;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @ClassName CodeParserTest
 * @Description
 * @Author xiangxiang
 * @Date 2025-08-2025/8/12-23:49
 * @Version 1.0
 */
class CodeParserTest {

    @Test
    void parseHtmlCode() {
        String codeContent = """
                随便写一段描述：
                ```html
     ‍         ‍  <!DOCTY⁡PE html>
                <html>
                <head>
                    <title>测试页面</title>
                </head>
                <body>
                    <h1>Hello World!</h1>
                </body>
                </html>
                ```
                随便写一段描述
                """;
        HtmlCodeResult result = CodeParser.parseHtmlCode(codeContent);
        assertNotNull(result);
        assertNotNull(result.getHtmlCode());
    }

    @Test
    void parseMultiFileCode() {
        String codeContent = """
                创建一个完整的网页：
                ```html
     ‍         ‍  <!DOCTY⁡PE html>
                <html>
                <head>
                    <title>多文件示例</title>
                    <link rel="stylesheet" href="style.css">
                </head>
                <body>
                    <h1>欢迎使用</h1>
                    <script src="script.js"></script>
                </body>
                </html>
                ```
                ```css
                h1 {
                    color: blue;
                    text-align: center;
                }
                ```
                ```js
                console.log('页面加载完成');
                ```
                文件创建完成！
                """;
        MultiFileCodeResult result = CodeParser.parseMultiFileCode(codeContent);
        assertNotNull(result);
        assertNotNull(result.getHtmlCode());
        assertNotNull(result.getCssCode());
        assertNotNull(result.getJsCode());
    }
}

