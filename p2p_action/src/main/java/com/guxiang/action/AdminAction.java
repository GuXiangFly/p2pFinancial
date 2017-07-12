package com.guxiang.action;

import com.guxiang.dao.domain.IAdminDAO;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.servlet.ServletContext;
import java.io.IOException;


/**
 * AdminAction
 *
 * @author guxiang
 * @date 2017/7/1
 */
@Controller
@Namespace("/account")
@Scope("prototype")  //代表action是多列的
public class AdminAction extends BaseAction {

    @Autowired
    private IAdminDAO adminDAO;


    @Action("login")
    public void login(){
        String username = this.getParameter("username");
        String password = this.getParameter("password");

        try {

            if ("tom".equals(username)&&"123".equals(password)){
                this.getResponse().getWriter().write("{\"status\":\"1\"}");
                return;
            }else {
                this.getResponse().getWriter().write("{\"status\":\"0\"}");
                return;
            }

            //ServletActionContext.getResponse().getWriter().write("{\"status\":\"1\"}");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
