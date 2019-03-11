package com.leoli.old_classmate.controller;

import com.leoli.old_classmate.entity.Schoolfellow;
import com.leoli.old_classmate.service.SchoolfellowServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchoolfellowController {

    @Autowired
    private SchoolfellowServer schoolfellowServer;

    @GetMapping("/get/schoolfellow/{id}")
    public Schoolfellow getSchoolfellow(@PathVariable String id){
        return schoolfellowServer.getSchoolfellowById(id);
    }
}
