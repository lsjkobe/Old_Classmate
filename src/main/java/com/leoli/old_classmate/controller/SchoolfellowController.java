package com.leoli.old_classmate.controller;

import com.leoli.old_classmate.entity.Schoolfellow;
import com.leoli.old_classmate.model.Result;
import com.leoli.old_classmate.service.SchoolfellowServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchoolfellowController {

    private final SchoolfellowServer schoolfellowServer;

    @Autowired
    public SchoolfellowController(SchoolfellowServer schoolfellowServer) {
        this.schoolfellowServer = schoolfellowServer;
    }

    @GetMapping("/get/schoolfellow/{id}")
    @ResponseBody
    public Result getSchoolfellow(@PathVariable String id) {
        Result result = Result.ERROR_EMPTY;

        Schoolfellow schoolfellow = schoolfellowServer.getSchoolfellowById(id);
        if (schoolfellow != null) {
            result = Result.OK.buildResult(schoolfellow);
        }

        return result;
    }
}
