package com.taboo.springcloud.service.interfaces;

import com.taboo.springcloud.entities.Department;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class DepartmentClientServiceFallbackFactory implements FallbackFactory<DepartmentClientService> {
    @Override
    public DepartmentClientService create(Throwable throwable) {
        return new DepartmentClientService() {
            @Override
            public Department get(long id) {
                return null;
            }

            @Override
            public List<Department> list() {
                return null;
            }

            @Override
            public boolean add(Department department) {
                return false;
            }
        };
    }
}
