package com.panda521.aop;

import com.panda521.utils.annotation.UseCase;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author chenjunfei
 * @email chenjunfei@bkrwin.com
 * @date 2019-02-25
 * 史莱姆的 观众 切面 POJO
 */

public class SlimeAopPOJO {

    public void hungry(){
        System.out.println("肚子饿了");
    }

    public void laugh(UseCase useCase){
        System.out.println(useCase.name()+"看到"+useCase.description()+"大笑");
    }

    public void around(ProceedingJoinPoint jp,int temperature)throws Throwable{
        System.out.println("现在温度是"+temperature);
        if(temperature<5){
            jp.proceed();
            return;
        }
        System.out.println("温度高于5度，不需要运动");
    }

    public void cheer(){
        System.out.println("人们在喝彩");
    }

}
