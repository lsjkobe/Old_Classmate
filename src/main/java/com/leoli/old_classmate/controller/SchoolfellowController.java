package com.leoli.old_classmate.controller;

import com.leoli.old_classmate.controller.vo.SchoolfellowVO;
import com.leoli.old_classmate.model.Result;
import com.leoli.old_classmate.service.SchoolfellowServer;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;


@RestController
public class SchoolfellowController {

    private final SchoolfellowServer schoolfellowServer;

    @Autowired
    public SchoolfellowController(SchoolfellowServer schoolfellowServer) {
        this.schoolfellowServer = schoolfellowServer;
    }

    @Value("${server.port}")
    String port;

    @ApiOperation(value = "获取校友信息", notes = "根据id获取")
    @ApiImplicitParam(name = "id", value = "校友id", required = true, dataType = "String", paramType = "path")
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

    @ApiOperation(value = "创建一个校友", notes = "根据SchoolfellowVO创建")
    @ApiImplicitParam(name = "schoolfellowVO", value = "校友信息", required = true, dataType = "SchoolfellowVO")
    @PostMapping("/api/v1/save/schoolfellow")
    public Result saveSchoolfellow(@RequestBody SchoolfellowVO schoolfellowVO) {
        schoolfellowServer.saveSchoolfellowById(schoolfellowVO);
        return Result.OK;
    }
}
