package org.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: MaiYu
 * @Date: Create in 16:47 2021/1/3
 */
@SpringBootApplication
@MapperScan("org.example.mapper")
public class MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisApplication.class,args);
    }
}
