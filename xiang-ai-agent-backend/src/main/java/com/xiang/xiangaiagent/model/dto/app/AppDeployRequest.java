package com.xiang.xiangaiagent.model.dto.app;

import lombok.Data;
import java.io.Serializable;

/**
 * APP 部署请求类
 */
@Data
public class AppDeployRequest implements Serializable {

    /**
     * 应用 id
     */
    private Long appId;

    private static final long serialVersionUID = 1L;
}
