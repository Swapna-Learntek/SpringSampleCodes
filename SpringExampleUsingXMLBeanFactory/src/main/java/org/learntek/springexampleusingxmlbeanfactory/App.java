package org.learntek.springexampleusingxmlbeanfactory;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World from main!" );
        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Greetings grt = (Greetings) factory.getBean("greetings");
        grt.setGreetings("Good Night");
        System.out.println(grt.sendGreetings());
        System.out.println(grt.getGreetings());
    }
}
