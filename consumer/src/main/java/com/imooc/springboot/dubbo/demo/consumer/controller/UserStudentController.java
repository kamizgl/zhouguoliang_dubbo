package com.imooc.springboot.dubbo.demo.consumer.controller;


import com.imooc.springboot.dubbo.demo.ThreadTraceUtils;
import com.imooc.springboot.dubbo.demo.consumer.entity.UserStudent;
import com.imooc.springboot.dubbo.demo.consumer.mapper.UserStudentMapper;
import com.imooc.springboot.dubbo.demo.consumer.service.IUserStudentService;
import org.apache.log4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2019-10-20
 */
@Controller
@RequestMapping("/STU/user-student")
public class UserStudentController {

//    @Autowired
//    IUserStudentService iUserStudentService;
    @Autowired
    private IUserStudentService userMapper;

    @RequestMapping("/nihao")
    public String sayHello(@RequestParam String name) {
        ThreadTraceUtils.trace();
        MDC.put("traceId","我是rquestID呀");
        UserStudent userStudent = new UserStudent();
        userStudent.setAge(1);
        userStudent.setId("1321456");
        userStudent.setName("zhouguoliang");
        userMapper.save(userStudent);
        return "";
    }
}
