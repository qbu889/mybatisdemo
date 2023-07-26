package com.example.demo;

import com.example.demo.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
        System.out.print("app init");
    }

    //    @RequestMapping("/hello")
    //    @ResponseBody
    //    String home() {
    //        System.out.print("hello");
    //        return "Hello ,spring boot!";
    //    }

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        System.out.print("index");
        return "index";
    }

    @RequestMapping("/userLogin")
    @ResponseBody
    public String userLogin(Model model) {
        User user = new User();
        user.setName("lzw");
        user.setAddress("fz");
        user.setAge(19);
        model.addAttribute("user",user);
        return "userLogin";
    }




}
