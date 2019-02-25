package com.panda521.aop;

/**
 * Created by Mr.ChenJF on 2019/2/26.
 * 暴风龙的技能
 */
public class AllyDragon implements AllySkill{

    @Override
    public void fire() {
        System.out.println("巨龙吐息");
    }

    @Override
    public void ice() {
        System.out.println("魔龙寒冰枪");
    }
}