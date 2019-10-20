package com.hunau.layui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.support.ServletContextResource;

import javax.servlet.ServletContext;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: 焦文垚
 * @单位：湖南农业大学物联网工程专业
 */
@Controller
@RequestMapping("/demo")
public class UserController {
    @GetMapping("/icon_button")
    public String icon_button() {
        return "icon_button";
    }
    @GetMapping("/UI")
    public String UI(){
        return "UI";
    }
}
