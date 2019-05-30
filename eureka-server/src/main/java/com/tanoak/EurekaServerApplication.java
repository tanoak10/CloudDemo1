package com.tanoak;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author tanoak@qq.com
 * @version 1.0
 * @date 2019/4/30 20:41
 * @Description 启动类
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {
    
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaServerApplication.class).web(true).run(args);
    }
    
}
