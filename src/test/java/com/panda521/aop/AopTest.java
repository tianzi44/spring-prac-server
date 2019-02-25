package com.panda521.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author chenjunfei
 * @email chenjunfei@bkrwin.com
 * @date 2019-02-25
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringAopConfig.class)
public class AopTest {
    @Autowired
    private Performer performer;

    @Test
    public void performTest(){
        performer.perform();
    }

}
