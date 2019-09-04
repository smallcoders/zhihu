/*
 *
 * Copyright (c) 2018. www.zhixue.com All rights Reserved.
 *
 */

package com.example.zhihu.common;

/**
 * 返回码
 * @author kxzhang
 */
public class ResultCode {
    public static final int SUCCESS = 200;
    /**
     * 内部错误
     */
    public static final int FAILED = 500;
    /**
     * 未认证
     */
    public static final int UNAUTHORIZED = 401;
    /**
     * 无权限
     */
    public static final int NO_POWER = 403;
    /**
     * token超时
     */
    public static final int TOKEN_TIME_OUT = 3002;

    
    /**
     * 2018教师节活动专属
     */
    //用户已经打过卡
    public static final int PUNCHCARD_ALREADY = 10001;
    //用户没有足够票
    public static final int NOENOUGH_VOTES = 10002;
    //未中奖
    public static final int UNBINGO = 10003;
    //中奖填写的收获信息不完整
    public static final int BINGOINFO_INSUFFICIENCY = 10004;
    //用户已经分享过
    public static final int SHARED_ALREADY = 10005;
}
