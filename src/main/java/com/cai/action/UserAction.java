package com.cai.action;

import com.cai.domain.User;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @Description
 * @Author Cai
 * @Date 2021-03-04 13:55
 */

public class UserAction extends ActionSupport {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String execute() throws Exception {
        System.out.println("User");
        return login();
    }

    public String login(){
        if ("testuser".equals(user.getUsername()) && "123".equals(user.getPassword())){
            return SUCCESS;
        } else {
            return ERROR;
        }
    }
}
