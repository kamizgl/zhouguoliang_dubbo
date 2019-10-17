package com.imooc.springboot.dubbo.demo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.imooc.springboot.dubbo.demo.DemoService;


import com.imooc.springboot.dubbo.demo.ThreadTraceUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.MDC;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoConsumerController {

    @Reference
    private DemoService demoService;

    private static Logger logger = Logger.getLogger(DemoConsumerController.class);
    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam String name) {
        ThreadTraceUtils.trace();
        MDC.put("traceId","我是rquestID呀");
        logger.info("123123");

        return demoService.sayHello(name);
    }

}