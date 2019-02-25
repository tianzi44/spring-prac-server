package com.panda521.aop;

/**
 * Created by Mr.ChenJF on 2019/2/25.
 * 史莱姆
 */
public interface Slime {
    void dance();

    /**
     * 获取热量
     * @param temperature
     */
    void getHeat(int temperature);

    /**
     * 捕食
     */
    void predation();
}