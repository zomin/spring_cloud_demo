/**
 * Created by Kalend Zhang on 2017/07/05,005 .
 */

package com.demo;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;


@FeignClient(value = "SERVICE-0",fallback = Service0RemoteHystrix.class)
public interface Service0Remote
{
   @RequestMapping(value = "/service")
   String service();
}
