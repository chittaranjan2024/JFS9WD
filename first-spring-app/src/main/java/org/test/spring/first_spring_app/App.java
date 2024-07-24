package org.test.spring.first_spring_app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App 
{
    public static void main( String[] args )
    {
      
    	//Resource resource=new ClassPathResource("metadata.xml");
    	//BeanFactory ioc=new XmlBeanFactory(resource);
    	
    	ApplicationContext ioc=new FileSystemXmlApplicationContext("C:\\Users\\Digital Suppliers\\Desktop\\metadata.xml");

    	System.out.println(ioc.getBean("emp1"));
    	System.out.println(ioc.getBean("emp2"));
    	
    	
    	
    }
}
