package com.erp.controller;

import com.erp.pojo.Emp;
import com.erp.service.EmpService;
import com.erp.util.TreeResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private EmpService empService;

    @RequestMapping("getPerms")
    public List<TreeResultUtil> getPerms(String username){
        return empService.getPerms(username);
    }
    @RequestMapping("logout")
    public String logout(HttpSession session){
        session.invalidate();
        //重定向回首页
        return "redirect:/";
    }
     @RequestMapping("/login")
   public boolean login(String username,String password,HttpSession session){
    Emp emp=empService.login(username,password);
    if (emp!=null){
        session.setAttribute("user",emp);
        return  true;
    }else {
            return  false;
    }
    }
    @RequestMapping("isLogin")
    public String isLogin(HttpSession session){
        Object user = session.getAttribute("user");
        if (user!=null){
            Emp emp= (Emp) user;
            return emp.getUsername();
        }
        return null;
    }


}
