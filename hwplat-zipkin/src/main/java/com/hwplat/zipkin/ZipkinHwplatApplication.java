package com.hwplat.zipkin;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin.server.EnableZipkinServer;
/**
 * <p>Tiltle: hwplat </p>
 * <p>Description: TODO(这里来描述信息) </p>
 * Author 陈德元
 * data: 2018-02-22
 * version: 1.0
 */
@EnableDiscoveryClient
@EnableZipkinServer
@SpringBootApplication
public class ZipkinHwplatApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZipkinHwplatApplication.class, args);
    }
}
