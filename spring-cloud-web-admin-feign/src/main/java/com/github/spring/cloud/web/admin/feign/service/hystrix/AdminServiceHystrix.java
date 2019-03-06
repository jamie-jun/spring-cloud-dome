package com.github.spring.cloud.web.admin.feign.service.hystrix;

import com.github.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

/**
 * @program: spring-cloud-dome
 * @description:
 * @author: Jamie
 * @create: 2019-03-05 12:59
 **/
@Component
public class AdminServiceHystrix implements AdminService {


    @Override
    public String sayHi(String message) {
        return "Hi, you message is:\"" +message+ "\" but request error.";
    }
}
