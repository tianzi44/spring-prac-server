package com.panda521.aop;

import com.panda521.utils.annotation.UseCase;
import org.springframework.stereotype.Component;

/**
 * @author chenjunfei
 * @email chenjunfei@bkrwin.com
 * @date 2019-02-25
 * 转生的史莱姆
 */
public class TranSlime implements Slime {
    public TranSlime() {
    }

    public TranSlime(String name, String show) {
        this.name = name;
        this.show = show;
    }

    @UseCase(name = "哥布塔", description = "萌王之舞")
    public void dance() {
        System.out.println(name + "在跳舞");
    }

    public void getHeat(int temperature) {
        System.out.println("现在温度：" + temperature + " 太冷了，需要吸收热量");
    }

    public void predation() {
        System.out.println(name + "表演" + show);
    }

    private String name;

    private String show;

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
