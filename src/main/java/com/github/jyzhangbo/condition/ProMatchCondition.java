package com.github.jyzhangbo.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Arrays;

/**
 * zhangbo
 */
public class ProMatchCondition implements Condition{
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment environment = context.getEnvironment();
        String[] profiles = environment.getActiveProfiles();

        return Arrays.stream(profiles).anyMatch(profile -> profile.equals("pro"));
    }
}
