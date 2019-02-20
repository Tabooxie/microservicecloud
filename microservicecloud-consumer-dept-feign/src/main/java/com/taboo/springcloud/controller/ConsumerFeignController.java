package com.taboo.springcloud.controller;

import com.taboo.springcloud.entities.Department;
import com.taboo.springcloud.service.interfaces.DepartmentClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ConsumerFeignController {

    @Autowired
    private DepartmentClientService departmentClientService;

    @GetMapping(value = "/consumer/department/get/{id}")
    public Department get(@PathVariable("id") Long id)
    {
        return this.departmentClientService.get(id);
    }

    @GetMapping(value = "/consumer/department/list")
    public List<Department> list()
    {
        return this.departmentClientService.list();
    }

    @PostMapping(value = "/consumer/department/add")
    public Object add(Department department)
    {
        return this.departmentClientService.add(department);
    }








}



