package com.funtl.hello.spring.cloud.alibaba.nacos.consumer.feign.Controller;

import com.funtl.hello.spring.cloud.alibaba.nacos.consumer.feign.Service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NacosProviderController {

    @Autowired
    private EchoService echoService;

    @GetMapping(value = "/echo/{message}")
    public String echo(@PathVariable String message) {
        return echoService.echo("Hi 我是 Feign 消费者" + message);
    }

}
