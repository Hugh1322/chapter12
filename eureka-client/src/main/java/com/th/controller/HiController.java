package com.th.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tianh on 2018/12/4.
 */
@RestController
public class HiController {

    @Value("${server.port}")
    String port;

    @GetMapping("/hi")
    @HystrixCommand(fallbackMethod = "hiError")
    public String hi(@RequestParam String name) {
        return "hi," + name + ".i'm from port:" + port;
    }

    public String hiError(String name) {
        return "error!" + name;
    }
}
