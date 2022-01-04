package com.grantphillips.sfgdi.controllers;

import com.grantphillips.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterBasedControllerTest {

   SetterInjectedController controller;

   @BeforeEach
   void setUp() {
      controller = new SetterInjectedController();
      controller.setGreetingService(new GreetingServiceImpl());
   }


   @Test
   void getGreeting() {
      System.out.println(controller.getGreeting());
   }

}