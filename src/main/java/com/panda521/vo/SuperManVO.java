package com.panda521.vo;

import org.springframework.context.annotation.Bean;

/**
 * Created by jack on 2018/12/23.
 */
public class SuperManVO {
    private String name;
    private Integer age;

    @Bean(value = "getUser2")
    public SuperManVO getUser2(){
        SuperManVO superManVO = new SuperManVO();
        superManVO.setName("张飞");
        superManVO.setAge(18);
        return superManVO;
    }

    @Override
    public String toString() {
        return "SuperManVO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}