package com.imooc.springboot.dubbo.demo.consumer.service.impl;



import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.imooc.springboot.dubbo.demo.consumer.entity.ChengYu;
import com.imooc.springboot.dubbo.demo.consumer.mapper.ChengYuMapper;
import com.imooc.springboot.dubbo.demo.consumer.service.IChengYuService;
import org.springframework.stereotype.Service;


/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-10-21
 */
@Service
public class ChengYuServiceImpl extends ServiceImpl<ChengYuMapper, ChengYu> implements IChengYuService {

}
