package com.tanoak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author tanoak@qq.com
 * @version 1.0
 * @date 2019/4/30 20:36
 * @Description 启动类
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class FeignApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class, args);
    }
    
}
