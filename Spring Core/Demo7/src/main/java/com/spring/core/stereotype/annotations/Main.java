package com.spring.core.stereotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main( String[] args )
    {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/stereotype/annotations/config.xml");
        Student s1 =  context.getBean("student",Student.class);
        Student s2 =  context.getBean("student",Student.class);

        //Student s1 =  context.getBean("ob",Student.class);

        System.out.println(s1);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

    }
}
