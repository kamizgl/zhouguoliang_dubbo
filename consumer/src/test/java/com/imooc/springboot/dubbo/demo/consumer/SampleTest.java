package com.imooc.springboot.dubbo.demo.consumer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.additional.query.impl.QueryChainWrapper;
import com.google.common.base.Charsets;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.imooc.springboot.dubbo.demo.consumer.entity.ChengYu;
import com.imooc.springboot.dubbo.demo.consumer.entity.UserStudent;
import com.imooc.springboot.dubbo.demo.consumer.mapper.ChengYuMapper;
import com.imooc.springboot.dubbo.demo.consumer.service.IChengYuService;
import com.imooc.springboot.dubbo.demo.consumer.service.IUserStudentService;
import org.assertj.core.util.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleTest {

    @Autowired
    private IUserStudentService iUserStudentService;

    @Autowired
    private IChengYuService IChengYuService;
    @Autowired
    private ChengYuMapper IChengYuService1;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        UserStudent userStudent = new UserStudent();
        userStudent.setAge(1);
        userStudent.setId("777");
        userStudent.setName("2222");
        iUserStudentService.save(userStudent);

    }

    @Test
    public void testsave()  {
        long startTime = System.currentTimeMillis(); //获取开始时间
        try {
            File file = new File("D:\\git\\chengyu\\chinese-xinhua\\data\\idiom.json");
            List<String> strings = Files.readLines(file, Charsets.UTF_8);
            JSONArray objects = JSON.parseArray(strings.get(0));
            List<ChengYu> chengYus = JSON.parseArray(strings.get(0), ChengYu.class);

            IChengYuService.saveBatch(chengYus);
        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis(); //获取结束时间
        System.out.println("程序运行时间：" + (endTime - startTime) + "ms"); //输出程序运行时间

    }

    @Test
    public void query()  {
        long startTime = System.currentTimeMillis(); //获取开始时间
        try {
            String word = "当";



            for (int i = 0; i <100 ; i++) {
                ChengYu chengYu = getChengYu(word);
                //拿到当前成语的最后一个字当作下一次的入参
                String word1 = chengYu.getPinyin();
                word = word1.substring(word1.length() - 1, word1.length());
                System.out.println(word1);
            }



        } catch (Exception e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis(); //获取结束时间
        System.out.println("程序运行时间：" + (endTime - startTime) + "ms"); //输出程序运行时间

    }

    private ChengYu getChengYu(String word) {
        QueryWrapper<ChengYu> queryWrapper = new QueryWrapper<>();
        queryWrapper.likeRight("PINYIN",word ).last("limit 1");

        return IChengYuService1.selectOne(queryWrapper);
    }

}
