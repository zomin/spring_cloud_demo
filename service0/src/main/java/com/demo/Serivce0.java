package com.demo;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by Kalend Zhang on 2017/07/05,005 .
 */

@SpringBootApplication
@EnableEurekaClient
@RestController
public class Serivce0
{
   Logger logger = Logger.getLogger(Serivce0.class);

   @Value("${neo.text:Hello World!}")
   private String text;

   @GetMapping("/service")
   public String service(){
      logger.info("service0");
      return "service0 reader config:"+text;
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
      SpringApplication.run(Serivce0.class, args);
   }

}
