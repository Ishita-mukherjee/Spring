package com.spring.core.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/standalone/collections/config.xml");
        Person p = (Person) context.getBean("p1");
        
        System.out.println(p);
        System.out.println(p.getFriends().getClass().getName());
        System.out.println(p.getFees().getClass().getName());

    }
}
