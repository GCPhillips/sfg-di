package com.grantphillips.sfgdi.config;

import com.grantphillips.sfgdi.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

   @Profile("ES")
   @Bean("I18nService")
   I18nSpanishGreetingService i18nSpanishGreetingService() {
      return new I18nSpanishGreetingService();
   }

   @Profile({"EN", "default"})
   @Bean
   I18nEnglishGreetingService I18nService() {
      return new I18nEnglishGreetingService();
   }

   @Primary
   @Bean
   PrimaryGreetingService primaryGreetingService() {
      return new PrimaryGreetingService();
   }

   @Bean
   ConstructorGreetingService constructorGreetingService() {
      return new ConstructorGreetingService();
   }

   @Bean
   PropertyInjectedGreetingService propertyInjectedGreetingService() {
      return new PropertyInjectedGreetingService();
   }

   @Bean
   SetterInjectedGreetingService setterInjectedGreetingService() {
      return new SetterInjectedGreetingService();
   }
}
