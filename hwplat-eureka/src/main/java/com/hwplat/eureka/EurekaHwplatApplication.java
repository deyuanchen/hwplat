package com.hwplat.eureka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <p>Tiltle: hwplat </p>
 * <p>Description: TODO(这里来描述信息) </p>
 * Author 陈德元
 * data: 2018-01-22
 * version: 1.0
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaHwplatApplication {
    private static Logger logger = LoggerFactory.getLogger(EurekaHwplatApplication.class);
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaHwplatApplication.class).web(true).run(args);
    }
}
