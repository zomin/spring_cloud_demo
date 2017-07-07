package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;


/**
 * Created by Kalend Zhang on 2017/07/05,005 .
 */

@SpringBootApplication
@EnableEurekaServer
@ComponentScan("com.demo")
public class Discovery
{
   public static void main(String[] args)
   {
      SpringApplication.run(Discovery.class,args);
   }
}
