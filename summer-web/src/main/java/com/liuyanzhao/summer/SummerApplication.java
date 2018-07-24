package com.liuyanzhao.summer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
@ComponentScan({"com.liuyanzhao.summer"})
@SpringBootApplication
public class SummerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SummerApplication.class, args);
    }
}
