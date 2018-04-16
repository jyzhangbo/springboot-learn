package com.github.jyzhangbo.service;

/**
 * zhangbo
 */
public class DevConditionService implements ConditionService{
    @Override
    public String condition() {
        return "dev";
    }
}
