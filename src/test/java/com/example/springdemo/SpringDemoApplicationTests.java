package com.example.springdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class SpringDemoApplicationTests {

    @Autowired
    RestTemplate restTemplate;

    @Test
    void contextLoads() {
    }

    @Test
    void baidu() {
        final String url = "http://www.baidu.com";
        System.out.println(restTemplate.getForObject(url, String.class));

    }
}
