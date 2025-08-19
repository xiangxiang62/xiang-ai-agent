package com.xiang.xiangaiagent.service;

import com.mybatisflex.core.paginate.Page;
import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import com.xiang.xiangaiagent.model.dto.chathisttory.ChatHistoryQueryRequest;
import com.xiang.xiangaiagent.model.entity.ChatHistory;
import com.xiang.xiangaiagent.model.entity.User;

import java.time.LocalDateTime;

/**
 *  服务层。
 *
 * @author <a href="https://github.com/xiangxiang62">香香</a>
 */
public interface ChatHistoryService extends IService<ChatHistory> {

    /**
     * 分页查询应用对话历史
     *
     * @param appId 应用 id
     * @param pageSize 分页大小
     * @param lastCreateTime 上次创建时间
     * @param loginUser 登录用户
     * @return
     */
    Page<ChatHistory> listAppChatHistoryByPage(Long appId, int pageSize,
                                               LocalDateTime lastCreateTime,
                                               User loginUser);

    /**
     * 获取查询包装类
     *
     * @param chatHistoryQueryRequest
     * @return
     */
    QueryWrapper getQueryWrapper(ChatHistoryQueryRequest chatHistoryQueryRequest);

    /**
     * 新增对话消息
     *
     * @param appId 应用 id
     * @param message 消息
     * @param messageType 消息类型
     * @param userId 用户 id
     * @return
     */
    boolean addChatMessage(Long appId, String message, String messageType, Long userId);


    /**
     * 根据应用 id 删除已停用
     *
     * @param appId 应用 id
     * @return
     */
    boolean deleteByAppId(Long appId);
}
