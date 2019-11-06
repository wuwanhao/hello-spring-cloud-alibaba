package com.funtl.hello.spring.cloud.alibaba.nacos.consumer.feign.Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "nacos-provider")
public interface EchoService {

    //对接provider中的接口
    @GetMapping(value = "/echo/{message}")
    String echo(@PathVariable("message") String message);
}
