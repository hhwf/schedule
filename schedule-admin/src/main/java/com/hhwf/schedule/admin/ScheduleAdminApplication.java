package com.hhwf.schedule.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan("com.hhwf.schedule.admin.dao.mapper")
public class ScheduleAdminApplication {


    public static void main(String[] args) {
        SpringApplication.run(ScheduleAdminApplication.class, args);
    }

}
