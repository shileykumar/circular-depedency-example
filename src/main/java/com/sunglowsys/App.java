package com.sunglowsys;

import com.sunglowsys.service.Service;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 *
 */

@Configuration
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.sunglowsys.bean");
        context.scan("com.sunglowsys.service");
        context.refresh();

        Service service = context.getBean(Service.class);
        service.service();
        context.close();
    }
}
