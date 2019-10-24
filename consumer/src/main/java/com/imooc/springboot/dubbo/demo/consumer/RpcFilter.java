package com.imooc.springboot.dubbo.demo.consumer;

import com.alibaba.dubbo.common.Constants;
import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.rpc.*;
import org.assertj.core.util.Lists;
import org.slf4j.MDC;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;

@Activate(group = {Constants.PROVIDER, Constants.CONSUMER})
public class RpcFilter implements Filter {


    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        String traceId = MDC.get("traceId");
        Map<String, String> map = new HashMap<String, String>();

        map.put("traceId", traceId);
        RpcContext.getContext().setAttachments(map);
        return invoker.invoke(invocation);
    }
    public static void main(String[] args) {
//        List<Object> objects = Lists.newArrayList();
////        objects.add("123");
////        objects.forEach(System.out::println);

        Consumer<String> stringConsumer = (String s) -> System.out.print(s);
        IntBinaryOperator intBinaryOperator = (int x, int y) -> x + y;

        System.out.println(intBinaryOperator.applyAsInt(1,2));
    }
}
