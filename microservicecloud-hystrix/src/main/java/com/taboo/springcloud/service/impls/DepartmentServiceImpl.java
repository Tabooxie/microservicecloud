package com.taboo.springcloud.service.impls;

import com.taboo.springcloud.entities.Department;
import com.taboo.springcloud.mapper.DepartmentMapper;
import com.taboo.springcloud.service.interfaces.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentMapper departmentMapper;

    @Override
    public boolean addDepartment(Department department) {
        return departmentMapper.addDepartment(department);
    }

    @Override
    public Department get(Integer id) {
        return departmentMapper.findById(id);
    }

    @Override
    public List<Department> list() {
        return departmentMapper.findAll();
    }
}
