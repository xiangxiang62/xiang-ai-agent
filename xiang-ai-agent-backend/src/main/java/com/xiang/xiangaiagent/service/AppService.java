package com.xiang.xiangaiagent.service;

import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import com.xiang.xiangaiagent.core.AiCodeGeneratorFacade;
import com.xiang.xiangaiagent.exception.BusinessException;
import com.xiang.xiangaiagent.exception.ErrorCode;
import com.xiang.xiangaiagent.exception.ThrowUtils;
import com.xiang.xiangaiagent.model.dto.app.AppQueryRequest;
import com.xiang.xiangaiagent.model.entity.App;
import com.xiang.xiangaiagent.model.entity.User;
import com.xiang.xiangaiagent.model.enums.CodeGenTypeEnum;
import com.xiang.xiangaiagent.model.vo.AppVO;
import jakarta.annotation.Resource;
import reactor.core.publisher.Flux;

import java.util.List;

/**
 *  服务层。
 *
 * @author <a href="https://github.com/xiangxiang62">香香</a>
 */
public interface AppService extends IService<App> {


    /**
     * 对话生成代码
     *
     * @param appId 应用 id
     * @param message 用户提示词
     * @param loginUser 登录用户
     * @return
     */
    Flux<String> chatToGenCode(Long appId, String message, User loginUser);

    /**
     * 批量获取应用返回类
     *
     * @param appList 应用实体列表
     * @return
     */
    List<AppVO> getAppVOList(List<App> appList);

    /**
     * 应用构造请求方法
     *
     * @param appQueryRequest 应用查询请求
     * @return
     */
    QueryWrapper getQueryWrapper(AppQueryRequest appQueryRequest);

    /**
     * 获取应用脱敏类
     *
     * @param app 应用类
     * @return
     */
    AppVO getAppVO(App app);
}
