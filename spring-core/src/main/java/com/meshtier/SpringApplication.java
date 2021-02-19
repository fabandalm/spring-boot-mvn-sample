package com.meshtier;

import com.meshtier.config.ApplicationConfig;
import com.meshtier.services.GreetingService;
import com.meshtier.services.OutputService;
import com.meshtier.services.TimeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplication {

    public static void main(String[] args) throws InterruptedException {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        OutputService outputService = applicationContext.getBean(OutputService.class);

        for (int i=0;i<5;i++){
            outputService.generateOutput("Fabio");
            Thread.sleep(500);
        }
    }

}



