package ru.ggalkin.taskmanagementsystem.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HttpController {

    @RequestMapping("/gethttp")
    public String getSettionsTime(HttpServletRequest request) {

        System.out.println(request.getSession().getCreationTime());
        System.out.println(request.getSession());
        System.out.println(request.getRemoteAddr());

        return "main";
    }

    @RequestMapping("/getUsers/{id}")
    public void getUsers() {

        System.out.println("");
    }

    @RequestMapping("/getUsers/{id}/getCourse/{id}")
    public void getBooks() {

    }


    @RequestMapping("/home/{id}")
    public String getHomePage(@RequestParam("id") String id, Model model) {

        return "";
    }
}
