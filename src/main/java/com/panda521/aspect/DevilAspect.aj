package com.panda521.aspect;

/**
 * Created by Mr.ChenJF on 2019/2/26.
 */
public aspect DevilAspect {
    public DevilAspect(){}

    pointcut predation():execution(* com.panda521.aop.TranSlime.predation(..));

    before() : predation(){
        System.out.println("异世界来了只史莱姆");
    }
}