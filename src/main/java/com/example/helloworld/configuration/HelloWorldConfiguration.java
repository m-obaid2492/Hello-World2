package main.java.com.example.helloworld.configuration;

import main.java.com.example.helloworld.provider.HelloWorldMessageProvider;
import main.java.com.example.helloworld.provider.MessageProvider;
import main.java.com.example.helloworld.renderer.MessageRenderer;
import main.java.com.example.helloworld.renderer.StandardOutMessageRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public MessageProvider provider() {
        return new HelloWorldMessageProvider();
    }

    @Bean
    public MessageRenderer renderer() {
        MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.setMessageProvider(provider());
        return renderer;
    }

}
