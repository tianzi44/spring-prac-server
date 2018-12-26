package com.panda521;

import com.panda521.service.Service1;
import com.panda521.vo.SuperManVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringPracServerApplication {

    @Autowired
    private Service1 service1;

    public static void main( String[] args ) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        //使用文件系统进行加载
//        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("E:/ZGit_Java/spring-prac-server/src/applicationContext.xml");
        SuperManVO superManVO =(SuperManVO) applicationContext.getBean("jack");
        System.out.println(superManVO);

    }
}
