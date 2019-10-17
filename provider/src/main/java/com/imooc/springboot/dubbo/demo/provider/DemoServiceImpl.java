package com.imooc.springboot.dubbo.demo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.imooc.springboot.dubbo.demo.DemoService;
import org.apache.log4j.Logger;

@Service
public class DemoServiceImpl implements DemoService {

    private static Logger logger = Logger.getLogger(DemoServiceImpl.class);

    public String sayHello(String name) {
        logger.info("DemoServiceImpl");
        return "Hello, " + name + " (from Spring Boot)";
    }

}