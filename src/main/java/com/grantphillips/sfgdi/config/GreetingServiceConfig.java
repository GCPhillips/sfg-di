package com.grantphillips.sfgdi.config;

import com.grantphillips.sfgdi.repositories.EnglishGreetingRepository;
import com.grantphillips.sfgdi.repositories.EnglishGreetingRepositoryImpl;
import com.grantphillips.sfgdi.services.*;
import org.springframework.context.annotation.*;

@ImportResource("classpath:sfgdi-config.xml")
@Configuration
public class GreetingServiceConfig {

   @Profile("ES")
   @Bean("I18nService")
   I18nSpanishGreetingService i18nSpanishGreetingService() {
      return new I18nSpanishGreetingService();
   }

   @Bean
   EnglishGreetingRepository englishGreetingRepository() {
      return new EnglishGreetingRepositoryImpl();
   }

   @Profile({"EN", "default"})
   @Bean
   I18nEnglishGreetingService I18nService(EnglishGreetingRepository englishGreetingRepository) {
      return new I18nEnglishGreetingService(englishGreetingRepository);
   }

   @Primary
   @Bean
   PrimaryGreetingService primaryGreetingService() {
      return new PrimaryGreetingService();
   }

   // now defined in the resources/sfgdi-config.xml configuration file
   /*
   @Bean
   ConstructorGreetingService constructorGreetingService() {
      return new ConstructorGreetingService();
   }
   */
   @Bean
   PropertyInjectedGreetingService propertyInjectedGreetingService() {
      return new PropertyInjectedGreetingService();
   }

   @Bean
   SetterInjectedGreetingService setterInjectedGreetingService() {
      return new SetterInjectedGreetingService();
   }
}
