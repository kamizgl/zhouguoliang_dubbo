package com.imooc.springboot.dubbo.demo.provider;

import com.alibaba.dubbo.common.Constants;
import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.rpc.*;
import org.slf4j.MDC;
@Activate(group = {Constants.PROVIDER, Constants.CONSUMER})
public class MdcFilter implements Filter {
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        String traceId = RpcContext.getContext().getAttachment("traceId");

        MDC.put("traceId", traceId);

        return invoker.invoke(invocation);
    }
}
