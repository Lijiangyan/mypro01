package com.my.action;

import com.my.entity.User;
import com.my.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by LJ on 16/7/20.
 */
public class UserAction {
    private String url;
    private User user;
    private UserService userService;

    public String login() {

        if ("".equals(user.getLoginName()) || "".equals(user.getLoginPswd())) {
            System.out.println("中文loginName or loginPswd is empty.");
            this.url = "/login.jsp";
            return "fail";
        }


        User tempUser = userService.login(user.getLoginName(), user.getLoginPswd());
        System.out.println("user = " + tempUser);
        if (tempUser == null) {
            System.out.println("loginName or loginPswd is uncorrect");
            this.url = "/login.jsp";
            return "fail";
        }

        HttpSession session = ServletActionContext.getRequest().getSession();
        session.setAttribute("currentUser", tempUser);
        System.out.println("login sussess");
        this.url = "/test.jsp";
        return "success";
    }

    public String register() {
        if ("".equals(user.getLoginName()) || "".equals(user.getLoginPswd()) || "".equals(user.getName())) {
            System.out.println("loginName or loginPswd or name is empty.");
            this.url = "/register.jsp";
            return "fail";
        }

        User temp = userService.register(user);
        //此处temp相当于把user直接返回,待修改
        if (temp == null) {
            this.url = "/register.jsp";
            return "fail";
        }

        HttpSession session = ServletActionContext.getRequest().getSession();
        session.setAttribute("currentUser", temp);

        this.url = "/test.jsp";
        return "success";
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
