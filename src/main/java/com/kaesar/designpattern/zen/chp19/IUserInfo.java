package com.kaesar.designpattern.zen.chp19;

/**
 * 用户信息接口
 */
public interface IUserInfo {
    // 获得用户姓名
    public String getUserName();
    // 获得家庭地址
    public String getHomeAddress();
    // 手机号码
    public String getMobileNumber();
    // 办公电话，一般是座机
    public String getOfficeTelNumber();
    // 职位
    public String getJobPosition();
    // 获得家庭电话
    public String getHomeTelNumber();
}
