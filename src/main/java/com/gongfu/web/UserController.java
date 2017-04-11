package com.gongfu.web;

import com.gongfu.web.client.ClientCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by a on 2017/3/29.
 */
@RestController
@Slf4j
public class UserController {

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = ClientCode.RPC_PCC_URL+"/test", method = RequestMethod.GET)
    public String test(Integer a, String b) {
        ServiceInstance instance = client.getLocalServiceInstance();
        log.info("/add, host:" + instance.getHost() + ", service_id:" + instance.getServiceId());
        return a+"-"+b;
    }
}
