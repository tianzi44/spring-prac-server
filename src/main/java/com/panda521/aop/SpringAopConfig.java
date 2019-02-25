package com.panda521.aop;

import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author chenjunfei
 * @email chenjunfei@bkrwin.com
 * @date 2019-02-25
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class SpringAopConfig {

    @Bean
    public Performer getPerformer(){
        return new Performer("小明","桑巴");
    }

}
