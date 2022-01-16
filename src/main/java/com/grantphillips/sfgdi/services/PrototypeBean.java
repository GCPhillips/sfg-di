package com.grantphillips.sfgdi.services;

import org.springframework.stereotype.Component;

@Component
public class PrototypeBean {

   public PrototypeBean() {
      System.out.println("--Creating a Prototype Bean--");
   }

   public String getMyScope() {
      return "I'm a Prototype";
   }
}
