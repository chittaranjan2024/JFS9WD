package org.test.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ioc=new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(ioc.getBean("emp1"));
    }
}
