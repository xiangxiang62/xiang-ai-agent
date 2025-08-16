package com.xiang.xiangaiagent.model.dto.app;

import lombok.Data;

import java.io.Serializable;

/**
 * APP 新增请求类
 */
@Data
public class AppAddRequest implements Serializable {

    /**
     * 应用初始化的 prompt
     */
    private String initPrompt;

    private static final long serialVersionUID = 1L;
}
