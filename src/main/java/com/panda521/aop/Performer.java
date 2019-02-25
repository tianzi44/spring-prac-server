package com.panda521.aop;

import org.springframework.stereotype.Component;

/**
 * @author chenjunfei
 * @email chenjunfei@bkrwin.com
 * @date 2019-02-25
 */
public class Performer {
    public Performer(){}

    public Performer(String name, String show) {
        this.name = name;
        this.show = show;
    }

    private String name;

    private String show;

    public void perform() {
        System.out.println(name + "表演" + show);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShow() {
        return show;
    }

    public void setShow(String show) {
        this.show = show;
    }

}
