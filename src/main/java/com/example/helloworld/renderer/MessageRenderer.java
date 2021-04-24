package main.java.com.example.helloworld.renderer;


import main.java.com.example.helloworld.provider.MessageProvider;

public interface MessageRenderer {

    void render();

    void setMessageProvider(MessageProvider provider);

    MessageProvider getMessageProvider();

}
