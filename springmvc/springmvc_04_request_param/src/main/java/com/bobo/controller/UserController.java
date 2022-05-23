package com.bobo.controller;

import com.bobo.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/save")
    @ResponseBody
    public String save() {
        return "{'module': 'user save'}";
    }

    @RequestMapping("/commonParam")
    @ResponseBody
    public String commonParam(String name, int age) {
        System.out.println(name);
        System.out.println(age);
        return "'module': 'user common param'";
    }

    @RequestMapping("/commonParamDiffName")
    @ResponseBody
    public String commonParamDiffName(@RequestParam("name") String username, int age) {
        System.out.println(username);
        System.out.println(age);
        return "'module': 'user common param'";
    }

    @RequestMapping("/pojoParam")
    @ResponseBody
    public String pojoParam(User user) {
        System.out.println(user);
        return "'module': 'user common param'";
    }

    @RequestMapping("/jsonParam")
    @ResponseBody
    public String jsonParam(@RequestBody List<String> likes) {
        System.out.println("yo");
        System.out.println(likes);
        return "'module': 'user common param'";
    }

    @RequestMapping("/jsonPojoParam")
    @ResponseBody
    public String jsonPojoParam(@RequestBody List<User> users) {
        System.out.println("yo");
        System.out.println(users);
        return "'module': 'user common param'";
    }
}
