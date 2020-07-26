package com.huawei.scheduled;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
// https://github.com/jufeng98/java-master/tree/master/b2c-parent
@SpringBootApplication
@MapperScan(basePackages ="com.huawei.scheduled.dao")
@EnableScheduling
public class ScheduledApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScheduledApplication.class, args);
    }

}
