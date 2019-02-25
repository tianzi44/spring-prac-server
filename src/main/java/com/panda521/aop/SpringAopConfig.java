package com.panda521.aop;

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
    public TranSlime getSlime(){
        return new TranSlime("利姆鲁","使用捕食者技能");
    }

}
