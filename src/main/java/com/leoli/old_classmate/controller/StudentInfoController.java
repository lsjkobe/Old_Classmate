package com.leoli.old_classmate.controller;// Copyright (c) 1998-2019 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2019-XX-XX, leo.li, creation
// ============================================================================

import com.leoli.old_classmate.entity.StudentInfo;
import com.leoli.old_classmate.model.Result;
import com.leoli.old_classmate.service.StudentInfoServer;
import com.leoli.old_classmate.serviceImpl.StudentInfoServerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentInfoController {

    private final StudentInfoServer studentInfoServer;

    @Autowired
    public StudentInfoController(StudentInfoServer studentInfoServer) {
        this.studentInfoServer = studentInfoServer;
    }

    @GetMapping("/api/v1/get/studentInfo/{schoolfellowId}")
    public Result getStudentInfo(@PathVariable("schoolfellowId") String schoolfellowId){
        return Result.OK.buildResult(studentInfoServer.getStudentInfos(schoolfellowId));
    }
}
