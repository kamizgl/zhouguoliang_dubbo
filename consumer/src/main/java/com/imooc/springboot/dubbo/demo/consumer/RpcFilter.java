package com.imooc.springboot.dubbo.demo.consumer;

import com.alibaba.dubbo.common.Constants;
import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.rpc.*;
import org.slf4j.MDC;

import java.util.HashMap;
import java.util.Map;
@Activate(group = {Constants.PROVIDER, Constants.CONSUMER})
public class RpcFilter implements Filter {


    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        String traceId = MDC.get("traceId");
        Map<String, String> map = new HashMap<String, String>();

        map.put("traceId", traceId);
        RpcContext.getContext().setAttachments(map);
        return invoker.invoke(invocation);
    }
}
