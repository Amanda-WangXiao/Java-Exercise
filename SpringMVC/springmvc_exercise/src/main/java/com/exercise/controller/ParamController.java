package com.exercise.controller;

import com.exercise.domain.Account;
import com.exercise.domain.User;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.MultipartStream;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/**
 * @Author: Xiao(Amanda) Wang
 * @Date: 2021/2/2 16:22
 * @GitHub: https://github.com/Amanda-WangXiao
 */
@Controller
@RequestMapping(path = "/params")
public class ParamController {
    @RequestMapping(path = "/test1")
    public String testParam(){
        System.out.println("Start Params Test");
        return "success";
    }

    @RequestMapping(path = "saveAccount")
    public String  saveAccount(Account account){
        System.out.println(account);
        return "success";
    }

    @RequestMapping(path = "servletGet")
    public String servletGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        System.out.println(httpServletRequest);
        HttpSession httpSession = httpServletRequest.getSession();
        System.out.println(httpSession);
        ServletContext servletContext = httpSession.getServletContext();
        System.out.println(servletContext);
        System.out.println(httpServletResponse);
        return "success";
    }

    @ModelAttribute
    public void setpass_age(HashMap<String, User> map){
        User user = new User();
        user.setAge(100);
        user.setPassword("8888888");
        map.put("abc",user);
    }

    @RequestMapping(path="/updateUser")
    public String updateUser(@ModelAttribute(value="abc") User user) {
        System.out.println(user);
        return "success";
    }

    @RequestMapping(path = "/upload")
    public String upload(HttpServletRequest httpServletRequest, MultipartFile upload) throws Exception{
        System.out.println("Start Upload...");
        String realPath=httpServletRequest.getSession().getServletContext().getRealPath("/uploads/");
        File file = new File(realPath);
        if (file.exists()==false) file.mkdirs();

        String filename = upload.getOriginalFilename();
        String uuid = UUID.randomUUID().toString();
        filename = uuid+"+"+filename;
        upload.transferTo(new File(realPath,filename));
        return "success";
    }
}
