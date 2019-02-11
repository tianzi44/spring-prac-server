package com.panda521.service.annotationPrac;

import com.panda521.utils.annotation.UseCase;

/**
 * Created by jack on 2019/2/11.
 */
public class UserCaseAnnoPrac {
    @UseCase(name="方法1",description = "方法1的描述")
    public void t1(){
        System.out.println("t1执行了");
    }
    @UseCase(name="方法2",description = "方法2的描述")
    public void t2(){
        System.out.println("t2执行了");
    }
}