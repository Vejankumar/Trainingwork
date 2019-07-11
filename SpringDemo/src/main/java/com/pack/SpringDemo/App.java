package com.pack.SpringDemo;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.expression.BeanFactoryAccessor;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App 
{
    public static void main( String[] args )
    {
    	Resource resource = new ClassPathResource("Beans.xml");
    	BeanFactory factory = new XmlBeanFactory(resource);
    	Scanner kb = new Scanner(System.in);
    	System.out.println("--------");
    	System.out.println("1. MAN");
    	System.out.println("2.WOMAN");
    	System.out.println("--------");
    	System.out.println("Enter Choice :");
    	String op = kb.next();
        Human obj = (Human) factory.getBean(op);
       /* obj.setName("Kiran");
        obj.setAge(25);*/
        
        System.out.println(obj);
    }
}
