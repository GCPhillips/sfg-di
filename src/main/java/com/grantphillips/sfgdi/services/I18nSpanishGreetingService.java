package com.grantphillips.sfgdi.services;

//@Service("I18nService")
public class I18nSpanishGreetingService implements GreetingService {
   @Override
   public String sayGreeting() {
      return "Hola, Mundo! - ES";
   }
}
