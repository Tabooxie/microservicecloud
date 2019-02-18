package com.taboo.taboorule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * Copyright: Copyright (c) 2019 Asiainfo
 * 
 * @ClassName：com.taboo.taboorule.TabooRule.java
 * @Description：
 * 
 * @version: v1.0.0
 * @author：xiejun5
 * @date: 2019-01-23
 * 
 * Modification History:
 * Date           Author            Version            Description
 *------------------------------------------------------------
 * 2019-01-23     xiejun5          v1.0.0               修改原因
 */
@Configuration
public class TabooRule {

    @Bean
    public IRule getDIYRule(){
        return new FiveRecycleRule();
    }
}
