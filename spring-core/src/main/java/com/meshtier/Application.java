package com.meshtier;

import com.meshtier.services.GreetingService;
import com.meshtier.services.OutputService;
import com.meshtier.services.TimeService;

public class Application {

    public static void main(String[] args) throws Exception {
        GreetingService greetingService = new GreetingService("Hello");
        TimeService timeService = new TimeService(true);
        OutputService outputService = new OutputService(greetingService, timeService);

        for (int i=0;i<5;i++){
            outputService.generateOutput("Fabio");
            Thread.sleep(500);
        }
    }
}
