package com.spring.constructor.ambiguity;

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
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/constructor/ambiguity/config.xml");
        Addition a = (Addition) context.getBean("add");

        a.doSum();
        
        //By default string is called
        //then from top whichever double or int is there that one is called
        //To avoid such ambiguity use type attribute in constructor-arg tag
    }
}
