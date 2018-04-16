package com.github.jyzhangbo.condition;

import com.github.jyzhangbo.service.ConditionService;
import com.github.jyzhangbo.service.DevConditionService;
import com.github.jyzhangbo.service.ProConditionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * zhangbo
 */
@Configuration
public class ConditionConfiguration {

    @Bean
    @Conditional(DevMatchCondition.class)
    public ConditionService devConditionService(){
        DevConditionService conditionService=new DevConditionService();
        return conditionService;
    }

    @Bean
    @Conditional(ProMatchCondition.class)
    public ConditionService proConditionService(){
        ProConditionService conditionService=new ProConditionService();
        return conditionService;
    }

}
