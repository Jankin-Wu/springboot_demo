package com.spring.demo.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetApi {

    @GetMapping("get")
    @ResponseBody
    public String getInfo() {
        return "如果输出这行字则证明成功使用Jenkinsfile构建";
    }
}
