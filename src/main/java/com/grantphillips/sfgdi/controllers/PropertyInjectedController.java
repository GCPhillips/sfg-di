package com.grantphillips.sfgdi.controllers;

import com.grantphillips.sfgdi.services.GreetingService;

public class PropertyInjectedController {

   public GreetingService greetingService;

   public String getGreeting() {
      return greetingService.sayGreeting();
   }
}
