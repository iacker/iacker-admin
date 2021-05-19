package com.iacker.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author iacker
 */
@MapperScan(basePackages = {"com.iacker.**.mapper"})
@SpringBootApplication(scanBasePackages = {"com.iacker"},exclude = { DataSourceAutoConfiguration.class })
public class AppApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppApplication.class, args);
    }

}
