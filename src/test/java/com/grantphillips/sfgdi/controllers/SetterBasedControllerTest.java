package com.grantphillips.sfgdi.controllers;

import com.grantphillips.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterBasedControllerTest {

   SetterInjectedController controller;

   @BeforeEach
   void setUp() {
      controller = new SetterInjectedController();
      controller.setGreetingService(new ConstructorGreetingService());
   }


   @Test
   void getGreeting() {
      System.out.println(controller.sayGreeting());
   }

}