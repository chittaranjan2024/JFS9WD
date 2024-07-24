package org.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext ioc=new ClassPathXmlApplicationContext("context.xml");
    	Message message=ioc.getBean(Message.class);
    	
    	System.out.println(message);
    }
}
