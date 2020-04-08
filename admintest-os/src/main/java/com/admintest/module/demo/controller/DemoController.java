package com.admintest.module.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: Shuangyu.liu
 * @Date: 2020/4/3 15:27
 * @Version: 1.0
 */
@Controller
@RequestMapping("/demo")
public class DemoController {
    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        String success = "SpringWeb配置正确";
        return success;
    }
}