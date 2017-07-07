/**
 * Created by Kalend Zhang on 2017/07/05,005 .
 */

package com.demo;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@RestController
public class Client{
   Logger logger = Logger.getLogger(Client.class);

   @Autowired
   private Service0Remote service0Remote;

   @Autowired
   private Service1Remote service1Remote;


   @RequestMapping(value = "/demo/{id}",method = RequestMethod.GET)
   public String uname(@PathVariable(value = "id") String id) {
      logger.info("Param:"+id);
      String res = "";
      if("SERVICE_0".equals(id)){
         res = service0Remote.service();
      } else {
         res = service1Remote.service();
      }
      return res;
   }

   public static void main(String[] args) {
      SpringApplication.run(Client.class,args);
   }
}
