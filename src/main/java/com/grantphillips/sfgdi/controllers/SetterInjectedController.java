package com.grantphillips.sfgdi.controllers;

import com.grantphillips.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController implements GreetingService {

   private GreetingService greetingService;

   @Qualifier("setterInjectedGreetingService")
   @Autowired
   public void setGreetingService(GreetingService greetingService) {
      this.greetingService = greetingService;
   }

   public String sayGreeting() {
      return greetingService.sayGreeting();
   }
}
