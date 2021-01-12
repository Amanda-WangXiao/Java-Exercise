package com.pojo;

import com.pojo.config.SpringConfig;
import com.pojo.dao.User;
import com.pojo.service.UserService;
import com.pojo.service.UserServiceImplement;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = ctx.getBean(UserService.class);

        //  Add a new user (id,name,age)
        User user = new User();
        user.setId(5);
        user.setName("Charlie");
        user.setAge(25);
        userService.insert(user);

        //  Delete a user whose id = ?
        userService.delete(5);

        //  Update users' info
        user.setAge(10);
        userService.update(user);

        //  Output info
        System.out.println(userService.findAll());
        System.out.println(userService.findOne(3));
        System.out.println(userService.Count());
    }
}
