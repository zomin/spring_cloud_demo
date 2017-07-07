/**
 * Created by Kalend Zhang on 2017/07/07,007 .
 */

package com.demo;

import org.springframework.stereotype.Component;


@Component
public class Service0RemoteHystrix implements Service0Remote
{
   @Override
   public String service()
   {
      return "service0 is error";
   }
}
