package com.github.jyzhangbo.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * zhangbo
 */
@Service
public class CacheService {

    @Cacheable(value = "realName",key="#userName")
    public String getRealName(String userName){

        System.out.println("调用方法查询数据");


        return userName+"_";

    }
}
