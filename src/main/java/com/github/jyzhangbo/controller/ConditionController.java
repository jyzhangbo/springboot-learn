package com.github.jyzhangbo.controller;

import com.github.jyzhangbo.service.ConditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * zhangbo
 */
@RestController
public class ConditionController {

    @Autowired
    private ConditionService service;

    @RequestMapping(value = "condition")
    public String condition(){
        String condition = service.condition();
        return condition;
    }

}
