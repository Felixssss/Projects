package com.gem.controller;

import com.sun.corba.se.spi.ior.ObjectKey;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HelloWorldController {
    @RequestMapping("/hello")
    @ResponseBody
    public Map<String, Object> hello(){
        Map<String, Object> map = new HashMap<>();
        map.put("msg", "hello world");
        return map;
    }
}
