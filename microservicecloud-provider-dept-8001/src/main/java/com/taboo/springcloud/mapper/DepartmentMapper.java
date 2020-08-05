package com.taboo.springcloud.mapper;

import com.taboo.springcloud.entities.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author taboo
 */
@Mapper
@Component
public interface DepartmentMapper {

    boolean addDepartment(Department department);

    Department findById(Integer id);

    List<Department> findAll();
}
