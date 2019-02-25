package com.panda521.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author chenjunfei
 * @email chenjunfei@bkrwin.com
 * @date 2019-02-25
 */

@Component
@Aspect
public class Audience {
    @Before("execution(* com.panda521.aop.Performer.*(..))")
    public void takeSeats(){
        System.out.println("人们找了个位置坐了下来");
    }
}
