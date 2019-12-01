package com.hhwf.schedule.admin.configuration;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter4;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by 32958 on 2019/12/1.
 */
@Configuration
public class FastJsonConfig {


    @Bean
    public FastJsonHttpMessageConverter fastJsonHttpMessageConverter(){
        FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
        return converter;
    }

}
