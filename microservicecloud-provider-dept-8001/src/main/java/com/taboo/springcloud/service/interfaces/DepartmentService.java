package com.taboo.springcloud.service.interfaces;

import com.taboo.springcloud.entities.Department;

import java.util.List;

public interface DepartmentService {
    boolean addDepartment(Department department);

    Department get(Integer id);

    List<Department> list();
}
