package com.demo;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by Kalend Zhang on 2017/07/05,005 .
 */

@SpringBootApplication
@EnableDiscoveryClient
@RestController
@ComponentScan("com.demo")
public class Service1
{
   Logger logger = Logger.getLogger(Service1.class);

   @GetMapping("/service")
   public String service(){
      return "service1";
   }

   @GetMapping("/info")
   public String info(){
      logger.info("info");
      return "info";
   }

   @GetMapping("/health")
   public String health(){
      logger.info("health");
      return "health";
   }

   public static void main(String[] args)
   {
      SpringApplication.run(Service1.class, args);
   }
}