package com.hhwf.schedule.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class ScheduleAdminApplication {


    public static void main(String[] args) {
        SpringApplication.run(ScheduleAdminApplication.class, args);
    }

}
