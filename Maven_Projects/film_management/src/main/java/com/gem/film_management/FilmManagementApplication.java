package com.gem.film_management;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.gem.film_management.mapper")
public class FilmManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(FilmManagementApplication.class, args);
    }

}

