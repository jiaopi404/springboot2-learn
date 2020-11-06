package com.example.demo001.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/error") // 不可用，推断应该非 RestController，而跳转到404
public class ErrorController {
    @RequestMapping(method = RequestMethod.GET)
    public String Error () {
        return "error";
    }
}
