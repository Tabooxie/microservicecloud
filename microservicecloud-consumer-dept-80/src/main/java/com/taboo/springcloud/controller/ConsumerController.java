package com.taboo.springcloud.controller;

import com.taboo.springcloud.entities.Department;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@Log4j2
public class ConsumerController {

/*
    private final transient Logger logger = LoggerFactory.getLogger(ConsumerController.class);
*/
    @Autowired
    RestTemplate restTemplate;
    private static final String REST_URL_SUFFIX = "http://localhost:8001";

    /**
     * 使用 使用restTemplate访问restful接口非常的简单粗暴无脑。 (url, requestMap,
     * ResponseBean.class)这三个参数分别代表 REST请求地址、请求参数、HTTP响应转换被转换成的对象类型。
     */

    @PostMapping("/consumer/department/add")
    public boolean addDepartment(Department department) {
        ResponseEntity<Boolean> booleanResponseEntity = restTemplate.postForEntity(REST_URL_SUFFIX + "/department/add", department, Boolean.class);
        return booleanResponseEntity.getBody();

    }

    public boolean addDepartment(Department department,String notes){
        Boolean postForObject = restTemplate.postForObject(REST_URL_SUFFIX + "/department/add", department, Boolean.class);
        System.out.println(notes);
        return postForObject;
    }

    @GetMapping("/consumer/department/{id}")
    public Department getById(@PathVariable("id") Integer id) {
        Department restTemplateForObject = restTemplate.getForObject(REST_URL_SUFFIX + "/department/" + String.valueOf(id), Department.class);
        return restTemplateForObject;
    }

    @SuppressWarnings("")
    @GetMapping("/consumer/department/list")
    public List<Department> list(){
        List restTemplateForObject = restTemplate.getForObject(REST_URL_SUFFIX + "/department/all", List.class);
        return restTemplateForObject;

    }
}



