package com.taboo.springcloud.service.interfaces;

import com.taboo.springcloud.entities.Department;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(value = "MICROSERVICECLOUDDEPT")
public interface DepartmentClientService {

    @GetMapping(value = "/department/{id}")
    Department get(@PathVariable("id") long id);

    @GetMapping(value = "/department/list")
    List<Department> list();

    @PostMapping(value = "/department/add")
    boolean add(Department department);
}
