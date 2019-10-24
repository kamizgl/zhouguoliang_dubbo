package com.imooc.springboot.dubbo.demo.consumer.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.imooc.springboot.dubbo.demo.consumer.entity.UserStudent;
import com.imooc.springboot.dubbo.demo.consumer.mapper.UserStudentMapper;
import com.imooc.springboot.dubbo.demo.consumer.service.IUserStudentService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-10-20
 */
@Service
public class UserStudentServiceImpl extends ServiceImpl<UserStudentMapper, UserStudent> implements IUserStudentService {

}
