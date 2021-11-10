package com.app.webchat.config;

import com.app.webchat.interceptor.HttpHandshakeInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

import java.util.ArrayList;
import java.util.Hashtable;

@Configuration
//Turns on the WebSocket message handling returned by the message broker.
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    private final HttpHandshakeInterceptor handshakeInterceptor;

    public WebSocketConfig(HttpHandshakeInterceptor handshakeInterceptor) {
        this.handshakeInterceptor = handshakeInterceptor;
    }


    //registers /ws,including optionally SockJS as an alternate messaging option when WebSocket is not available.
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/ws").setAllowedOriginPatterns("*").withSockJS();

    }

    //Returns messages back to the client in directions with the /topic prefix
    //It also declares the /app prefix for messages bound to methods annotated with @MessageMapping
    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        config.enableSimpleBroker("/user");
        config.setApplicationDestinationPrefixes("/app");
        config.setUserDestinationPrefix("/user");
    }


}
