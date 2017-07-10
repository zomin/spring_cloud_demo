/**
 * Created by Kalend Zhang on 2017/07/07,007 .
 */

package com.demo;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;


@Component
public class Service0RemoteHystrix implements Service0Remote
{
   @Override
   public String service(@PathVariable(value = "id") String id)
   {
      return "service0 param:"+ id +" is error";
   }
}
