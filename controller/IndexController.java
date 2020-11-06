package com.example.demo001.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class IndexController {
    @RequestMapping(method = RequestMethod.GET)
    public String index () {
        return "index";
    }

    @RequestMapping("/abc")
    public String indexAbc () {
        return "index.abc";
    }
}
