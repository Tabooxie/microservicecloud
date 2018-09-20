package com.taboo.springcloud.controller;

import com.taboo.springcloud.entities.Department;
import com.taboo.springcloud.service.interfaces.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @RequestMapping(value = "/department/add",method = RequestMethod.POST)
    public boolean add(Department department){
        return departmentService.addDepartment(department);
    }

    @GetMapping("/department/{id}")
    public Department findById(@PathVariable("id") Integer id){
        return departmentService.get(id);
    }

    @GetMapping("/department/all")
    public List<Department> list(){
        return departmentService.list();
    }
}
