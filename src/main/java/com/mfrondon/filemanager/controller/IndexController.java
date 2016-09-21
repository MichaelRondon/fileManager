package com.mfrondon.filemanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jt on 11/6/15.
 */
@Controller
public class IndexController {

    @RequestMapping({"/", ""})
    public String index(){
        return "index";
    }

    @RequestMapping({"/p", ""})
    public String index1(){
        return "index_1";
    }

    @RequestMapping("/access_denied")
    public String notAuth(){
        return "access_denied";
    }

    @RequestMapping("login")
    public String loginForm(){
        return "login";
    }
}
