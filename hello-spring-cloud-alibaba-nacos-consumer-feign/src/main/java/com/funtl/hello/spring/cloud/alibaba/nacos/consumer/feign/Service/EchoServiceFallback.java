package com.funtl.hello.spring.cloud.alibaba.nacos.consumer.feign.Service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class EchoServiceFallback implements EchoService {

    //重写EchoService中的echo方法
    @Override
    public String echo(String message) {
        return "echo fallback";
    }

}
