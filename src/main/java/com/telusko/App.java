package com.telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //This line creates the container
        ApplicationContext context = new ClassPathXmlApplicationContext();
        Dev obj = context.getBean(Dev.class);
        obj.build();
    }
}
