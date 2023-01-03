package com.spring.core.constructor_injection;

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
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/constructor_injection/config.xml");
        Person pp = (Person) context.getBean("p1");

        System.out.println(pp);

    }
}
