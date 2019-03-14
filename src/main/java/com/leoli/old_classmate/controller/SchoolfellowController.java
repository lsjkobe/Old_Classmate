package com.leoli.old_classmate.controller;

import com.leoli.old_classmate.controller.vo.SchoolfellowVO;
import com.leoli.old_classmate.model.Result;
import com.leoli.old_classmate.service.SchoolfellowServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SchoolfellowController {

    private final SchoolfellowServer schoolfellowServer;

    @Autowired
    public SchoolfellowController(SchoolfellowServer schoolfellowServer) {
        this.schoolfellowServer = schoolfellowServer;
    }

    @GetMapping("/api/v1/get/schoolfellow/{id}")
    @ResponseBody
    public Result getSchoolfellow(@PathVariable String id) {
        Result result = Result.ERROR_EMPTY;
        SchoolfellowVO schoolfellow = schoolfellowServer.getSchoolfellowById(id);
        if (schoolfellow != null) {
            result = Result.OK.buildResult(schoolfellow);
        }
        return result;
    }

    @PostMapping("/api/v1/save/schoolfellow")
    public Result saveSchoolfellow(@RequestBody SchoolfellowVO schoolfellowVO) {
        schoolfellowServer.saveSchoolfellowById(schoolfellowVO);
        return Result.OK;
    }
}
