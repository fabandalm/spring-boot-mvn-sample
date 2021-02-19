package com.meshtier.config;

import com.meshtier.services.GreetingService;
import com.meshtier.services.OutputService;
import com.meshtier.services.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

public class ApplicationConfig {

    @Value("Hello")
    private String greeting;

    @Autowired
    private TimeService timeService;

    @Autowired
    private GreetingService greetingService;

    @Bean
    public TimeService timeService(){
        return new TimeService(true);
    }

    @Bean
    public OutputService outputService(){
        return new OutputService(greetingService, timeService);
    }

    @Bean
    public GreetingService greetingService(){
        return new GreetingService("Hello");
    }

}
