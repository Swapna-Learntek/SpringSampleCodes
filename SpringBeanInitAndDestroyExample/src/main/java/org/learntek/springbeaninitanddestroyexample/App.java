package org.learntek.springbeaninitanddestroyexample;

//import org.learntek.SpringAppUsingPostConstructandPredestroy.DatabaseInitializer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        DatabaseInitializer di = ctx.getBean("dbInit",DatabaseInitializer.class);
        di.customUtilMethod(); 
        ctx.close();
        ctx.close();
    }
}
