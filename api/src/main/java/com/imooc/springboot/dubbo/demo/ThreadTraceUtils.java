package com.imooc.springboot.dubbo.demo;

public class ThreadTraceUtils {
    private static ThreadLocal<String> trachlocal = new ThreadLocal<String>();

    public static String trace(){
        return trachlocal.get();
    }

    public static void setTrace(String trace) {
        trachlocal.set(trace);
    }
}
