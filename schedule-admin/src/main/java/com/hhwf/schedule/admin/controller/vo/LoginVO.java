package com.hhwf.schedule.admin.controller.vo;

/**
 * @Auther: fei.wei
 * @Date: 2019/12/2 19:49
 * @Description:
 */
public class LoginVO {

    private String userName;

    private String password;

    private String verifyCode;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }
}
