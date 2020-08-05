package com.taboo.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.taboo.springcloud.entities.Department;
import com.taboo.springcloud.service.interfaces.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    private static final Logger logger = LoggerFactory.getLogger(DepartmentController.class);
    @Autowired
    DepartmentService departmentService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/department/add",method = RequestMethod.POST)
    public boolean add(Department department){
        return departmentService.addDepartment(department);
    }

    @GetMapping("/department/{id}")
    @HystrixCommand(fallbackMethod = "processHystrixGet")
    public Department findById(@PathVariable("id") Integer id){
        return departmentService.get(id);
    }

    public Department processHystrixGet(int id){
        return new Department().setId(id)
                .setDepartmentName("hystrix test").setDbSource("db");
    }

    @GetMapping("/department/list")
    public List<Department> list(){
        return departmentService.list();
    }

    @GetMapping("/department/discovery")
    public Object discovery() {
        List<String> list  = discoveryClient.getServices();
        logger.error("discoveryClient.getServices():".concat(list.toString()));

        List<ServiceInstance> srvList = discoveryClient.getInstances("microserviceclouddept");
        logger.error("discoveryClient.getInstances():".concat(srvList.toString()));
        for (ServiceInstance serviceInstance : srvList){
            logger.error(serviceInstance.getServiceId());
            logger.error(serviceInstance.getHost());
            logger.error(String.valueOf(serviceInstance.getPort()));
            logger.error(serviceInstance.getUri().toString());
        }


        return this.discoveryClient;
    }
}
