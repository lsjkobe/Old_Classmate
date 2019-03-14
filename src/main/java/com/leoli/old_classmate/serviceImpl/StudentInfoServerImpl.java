package com.leoli.old_classmate.serviceImpl;// Copyright (c) 1998-2019 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2019-XX-XX, leo.li, creation
// ============================================================================


import com.leoli.old_classmate.controller.vo.StudentInfoVO;
import com.leoli.old_classmate.mapper.StudentInfoMapper;
import com.leoli.old_classmate.model.converter.StudentInfoDTOConverter;
import com.leoli.old_classmate.model.repository.StudentInfoRepository;
import com.leoli.old_classmate.service.StudentInfoServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentInfoServerImpl implements StudentInfoServer {

    private final StudentInfoRepository studentInfoRepository;

    private final StudentInfoDTOConverter studentInfoDTOConverter;

    @Autowired
    public StudentInfoServerImpl(StudentInfoRepository studentInfoRepository, StudentInfoDTOConverter studentInfoDTOConverter) {
        this.studentInfoRepository = studentInfoRepository;
        this.studentInfoDTOConverter = studentInfoDTOConverter;
    }

    @Override
    public List<StudentInfoVO> getStudentInfos(String schoolfellowId) {
        return studentInfoDTOConverter.dtos2vos(studentInfoRepository.getStudentInfos(schoolfellowId));
    }
}
