package com.gem.filter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan  //扫描servlet
public class App_1 {
    public static void main(String[] args) {
        SpringApplication.run(App_1.class, args);
    }
}
