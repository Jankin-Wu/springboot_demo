package com.spring.demo.springbootdemo.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeiApi {

    @GetMapping("get")
    @ResponseBody
    public String getInfo() {
        return "如果输出这行字则证明成功运行";
    }
}
