package com.example.demo001.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Student {
    int id;
    String name;
    public Student (int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

class ResponseBody<E> {
    int code;
    E data;
    public ResponseBody(int code, E data) {
        this.code = code;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public E getData() {
        return data;
    }
}

@RestController
@RequestMapping("/index")
public class IndexController {
    @RequestMapping(method = RequestMethod.GET)
    public String index () {
        return "index";
    }

    @RequestMapping("/abc") // 子路径
    public String indexAbc () {
        return "index.abc";
    }

    @RequestMapping("/list")
    public List<Student> listMethod () {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "JooPee"));
        list.add(new Student(2, "See"));
        list.add(new Student(3, "Yoo"));
        return list;
    }

    @RequestMapping("/map")
    public Map<String, String> mapMethod () {
        Map<String, String> mapList = new HashMap<>();
        mapList.put("1", new Student(1, "JooPee").getName());
        return mapList;
    }

    @RequestMapping("/get-student")
    public Student getStu () {
        return new Student(1, "joopee");
    }

    @RequestMapping("/get-all-stu")
    public List<Student> getAllStu () {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "JooPee"));
        list.add(new Student(2, "JoPy"));
        return list;
    }

    @RequestMapping("/map-get-all-stu")
    public ResponseBody<List<Student>> mapGetAllStu () {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "JooPee"));
        list.add(new Student(2, "JoPy"));
        return new ResponseBody<>(200, list);
    }
}
