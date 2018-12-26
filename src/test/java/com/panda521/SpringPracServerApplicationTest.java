package com.panda521;

import static org.junit.Assert.assertTrue;

import com.panda521.service.Service1;
import com.panda521.vo.SuperManVO;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Unit test for simple SpringPracServerApplication.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class SpringPracServerApplicationTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue( true );
    }

    @Before
    public void init() {
        System.out.println("做做准备工作");
    }

    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        SuperManVO superManVO = applicationContext.getBean("jack", SuperManVO.class);
        Assert.assertTrue(superManVO != null);
        System.out.println(superManVO);
    }

    @Test
    public void test2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        SuperManVO superManVO = applicationContext.getBean("getUser2", SuperManVO.class);
        Assert.assertTrue(superManVO != null);
        System.out.println(superManVO);
    }

    @Autowired
    private Service1 service1;

    @Test
    public void test3() {
        String h1 = service1.h1();
        Assert.assertTrue(!h1.isEmpty());
        System.out.println(h1);
    }
}
