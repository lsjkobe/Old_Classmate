package com.leoli.old_classmate.serviceImpl;// Copyright (c) 1998-2019 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2019-XX-XX, leo.li, creation
// ============================================================================


import com.leoli.old_classmate.entity.StudentInfo;
import com.leoli.old_classmate.mapper.StudentInfoMapper;
import com.leoli.old_classmate.service.StudentInfoServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentInfoServerImpl implements StudentInfoServer {


    private final StudentInfoMapper studentInfoMapper;

    @Autowired
    public StudentInfoServerImpl(StudentInfoMapper studentInfoMapper) {
        this.studentInfoMapper = studentInfoMapper;
    }

    @Override
    public List<StudentInfo> getStudentInfos(String schoolfellowId) {
        return studentInfoMapper.getStudentInfos(schoolfellowId);
    }
}
