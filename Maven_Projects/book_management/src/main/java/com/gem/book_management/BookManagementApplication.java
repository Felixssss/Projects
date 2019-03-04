package com.gem.book_management;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.gem.book_management.admin.mapper","com.gem.book_management.book.mapper"})
public class BookManagementApplication {

    public static void main(String[] args) {

        SpringApplication.run(BookManagementApplication.class, args);
    }

}

