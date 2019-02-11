package com.panda521.utils.annotation;

import com.panda521.service.annotationPrac.UserCaseAnnoPrac;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by Mr.ChenJF on 2019/2/11.
 * @UseCase 的处理器
 */
public class UseCaseTracer {
    public void handle(Class c1){
        //1.get method
        Method[] ms = c1.getMethods();
        //2.get method's annotation
        if(ms==null||ms.length<1){
            System.out.println(c1.getName()+"没有方法");
            return;
        }
        //3.get annotation's value
        for(Method m:ms){
            Annotation[] annotations = m.getDeclaredAnnotations();
            if(annotations==null||annotations.length<1){
                continue;
            }
            for (Annotation annotation:annotations){
                if(annotation instanceof UseCase){
                    UseCase useCase = (UseCase) annotation;
                    System.out.println(useCase.name()+useCase.description());
                }
            }
        }
    }

    public static void main(String[] args){
        UseCaseTracer useCaseTracer = new UseCaseTracer();
        useCaseTracer.handle(UserCaseAnnoPrac.class);
    }
}