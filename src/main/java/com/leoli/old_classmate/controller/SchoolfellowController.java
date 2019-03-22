package com.leoli.old_classmate.controller;

import com.leoli.old_classmate.controller.vo.SchoolfellowVO;
import com.leoli.old_classmate.model.Result;
import com.leoli.old_classmate.service.SchoolfellowServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Random;


@RestController
public class SchoolfellowController {

    private final SchoolfellowServer schoolfellowServer;

    @Autowired
    public SchoolfellowController(SchoolfellowServer schoolfellowServer) {
        this.schoolfellowServer = schoolfellowServer;
    }

    @Value("${server.port}")
    String port;

    @GetMapping("/api/v1/get/schoolfellow/{id}")
    @ResponseBody
    public Result getSchoolfellow(@PathVariable String id) throws InterruptedException {
//        Result result = Result.ERROR_EMPTY;
//        SchoolfellowVO schoolfellow = schoolfellowServer.getSchoolfellowById(id);
//        if (schoolfellow != null) {
//            result = Result.OK.buildResult(schoolfellow);
//        }
//        return result;

        Result result = Result.ERROR_EMPTY;
        SchoolfellowVO schoolfellow = schoolfellowServer.getSchoolfellowById(id);
//        if(new Random().nextInt(2) == 1){
//            Thread.sleep(3000L);
//        }
        if (schoolfellow != null) {
            result = Result.OK.buildResult(schoolfellow);
            result.setCode(port+":"+result.getCode());
        }
        return result;
    }

    @PostMapping("/api/v1/save/schoolfellow")
    public Result saveSchoolfellow(@RequestBody SchoolfellowVO schoolfellowVO) {
        schoolfellowServer.saveSchoolfellowById(schoolfellowVO);
        return Result.OK;
    }
}
