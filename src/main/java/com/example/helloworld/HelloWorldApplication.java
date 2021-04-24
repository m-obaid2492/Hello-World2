package main.java.com.example.helloworld;


import main.java.com.example.helloworld.configuration.HelloWorldConfiguration;
import main.java.com.example.helloworld.renderer.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class HelloWorldApplication {

    public static void main(String[] args) {


        ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
        mr.render();


    }
}
