package com.gem.pet_management;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan()
public class PetManagementApplication {

    public static void main(String[] args) {

        SpringApplication.run(PetManagementApplication.class, args);
    }

}

