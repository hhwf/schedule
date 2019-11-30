package com.hhwf.schedule.admin.configuration;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @Auther: fei.wei
 * @Date: 2019/11/27 17:37
 * @Description:
 */
@Configuration
@MapperScan("com.hhwf.schedule.admin.mapper")
public class MybatisPlusConfig {

    @Autowired
    private DataSource dataSource;

    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }


}
