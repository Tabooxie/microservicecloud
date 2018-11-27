package com.taboo.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Copyright: Copyright (c) 2018 Taboo
 * 
 * @ClassName：com.taboo.cachedemo.SpringbootCacheDemoApplication.java
 * @Description：
 * 
 * @version: v1.0.0
 * @author：Taboo
 * @date: 2018-06-10
 * 搭建基本环境：
 * Step1:导入数据库文件，创建表
 * Step2:创建javabean封装数据
 * Step3:整合mybatis操作数据库
 *       1.配置数据源信息
 *       2.使用注解版mybatis
 *体验缓存
 * Step1:开启基于注解的缓存
 * Step2:标注缓存注解即可
 *
 * Modification History:
 * Date           Author            Version            Description
 *------------------------------------------------------------
 * 2018-06-10     xiejun5          v1.0.0               修改原因
 */

@SpringBootApplication
@EnableDiscoveryClient
public class DepartmentProvider8001_Application {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentProvider8001_Application.class, args);
	}



}
