package com.github.spring.cloud.web.admin.feign.service;

import com.github.spring.cloud.web.admin.feign.service.hystrix.AdminServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: spring-cloud-dome
 * @description:
 * @author: Jamie
 * @create: 2019-03-05 12:36
 **/

@FeignClient(value = "spring-cloud-service-admin",fallback = AdminServiceHystrix.class)
public interface AdminService {

    @RequestMapping(value = "hi",method = RequestMethod.GET)
    String sayHi(@RequestParam (value = "message") String message);

}
