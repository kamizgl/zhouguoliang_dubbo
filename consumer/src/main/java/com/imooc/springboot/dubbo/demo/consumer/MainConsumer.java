package com.imooc.springboot.dubbo.demo.consumer;



import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.imooc.springboot.dubbo.demo.consumer.mapper")
public class MainConsumer {

    public static void main(String[] args) {
        SpringApplication.run(MainConsumer.class,args);
    }

}