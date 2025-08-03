package com.xiang.xiangaiagent.service;

import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import com.xiang.xiangaiagent.model.dto.user.UserQueryRequest;
import com.xiang.xiangaiagent.model.entity.User;
import com.xiang.xiangaiagent.model.vo.LoginUserVO;
import com.xiang.xiangaiagent.model.vo.UserVO;
import jakarta.servlet.http.HttpServletRequest;

import java.util.List;

/**
 *  服务层。
 *
 * @author <a href="https://github.com/xiangxiang62i">香香</a>
 */
public interface UserService extends IService<User> {

    /**
     * 用户注册
     *
     * @param userAccount   用户账户
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
     * @return 新用户 id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 密码加密
     *
     * @param userPassword 用户密码
     * @return
     */
    String getEncryptPassword(String userPassword);


    /**
     * 获取脱敏的已登录用户信息
     *
     * @return
     */
    LoginUserVO getLoginUserVO(User user);


    /**
     * 用户登录
     *
     * @param userAccount  用户账户
     * @param userPassword 用户密码
     * @param request
     * @return 脱敏后的用户信息
     */
    LoginUserVO userLogin(String userAccount, String userPassword, HttpServletRequest request);


    /**
     * 获取当前登录用户
     *
     * @param request
     * @return
     */
    User getLoginUser(HttpServletRequest request);


    /**
     * 用户注销
     *
     * @param request
     * @return
     */
    boolean userLogout(HttpServletRequest request);

    /**
     * 用户实体转 VO
     *
     * @param user 用户实体
     * @return
     */
    UserVO getUserVO(User user);

    /**
     * 用户实体列表转 VO
     *
     * @param userList 用户实体列表
     * @return
     */
    List<UserVO> getUserVOList(List<User> userList);

    /**
     * 查询用户信息构造器
     *
     * @param userQueryRequest 用户查询请求
     * @return
     */
    QueryWrapper getQueryWrapper(UserQueryRequest userQueryRequest);
}
