package com.panda521;

import com.panda521.vo.SuperManVO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringPracServerApplication {
    public static void main( String[] args ) {
//        System.out.println( "Hello World!" );
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        //使用文件系统进行加载
//        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("E:/ZGit_Java/spring-prac-server/src/applicationContext.xml");
        SuperManVO superManVO =(SuperManVO) applicationContext.getBean("jack");
        System.out.println(superManVO);
    }
}
