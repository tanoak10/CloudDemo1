package com.tanoak;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author tanoak@qq.com
 * @version 1.0
 * @date 2019/4/30 20:36
 * @Description 启动类
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ComputeServiceApplication {
    
    public static void main(String[] args) {
        new SpringApplicationBuilder(ComputeServiceApplication.class).web(true).run(args);
    }
    
}
