package org.learntek.springhelloworldusingjavaconfig;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
        //ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        AnnotationConfigApplicationContext appCtx = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorldBean = appCtx.getBean("helloWorld",HelloWorld.class);
        helloWorldBean.sayHello();
        System.out.println("return statement from getmessage method = " + helloWorldBean.getMessage());
    }
}
