package org.learntek.springhelloworld;

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
        System.out.println( "Hello From Main Class!" );
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld helloWorldBean = ctx.getBean("helloworld",HelloWorld.class);
        helloWorldBean.sayHello();
        Message messageBean = ctx.getBean("message",Message.class);
        messageBean.sendMessage();
    }
}
