package com.grantphillips.sfgdi.services;

//@Service
public class PropertyInjectedGreetingService implements GreetingService {
   @Override
   public String sayGreeting() {
      return "Hello World - Property";
   }
}
