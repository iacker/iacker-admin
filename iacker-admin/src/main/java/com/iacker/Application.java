package com.iacker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author iacker
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
