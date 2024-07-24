package org.test.spring.ecommerce_app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ioc=new ClassPathXmlApplicationContext("context.xml");
    	System.out.println(ioc.getBean("customer1"));
    	//System.out.println(ioc.getBean("customer1"));
    	//System.out.println(ioc.getBean("customer1"));
    }
}
