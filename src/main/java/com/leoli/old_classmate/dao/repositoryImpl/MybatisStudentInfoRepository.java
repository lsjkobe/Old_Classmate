package com.leoli.old_classmate.dao.repositoryImpl;// Copyright (c) 1998-2019 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2019-XX-XX, leo.li, creation
// ============================================================================


import com.leoli.old_classmate.common.utils.RedisUtil;
import com.leoli.old_classmate.dao.DO.StudentInfoDO;
import com.leoli.old_classmate.dao.converter.SchoolDOConverter;
import com.leoli.old_classmate.dao.converter.StudentInfoDOConverter;
import com.leoli.old_classmate.mapper.StudentInfoMapper;
import com.leoli.old_classmate.model.entity.School;
import com.leoli.old_classmate.model.entity.StudentInfo;
import com.leoli.old_classmate.model.repository.StudentInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MybatisStudentInfoRepository implements StudentInfoRepository {

    private final StudentInfoMapper studentInfoMapper;

    private final StudentInfoDOConverter studentInfoDOConverter;

    private final SchoolDOConverter schoolDOConverter;

    private final RedisUtil redisUtil;

    private final String CUR_MODULE = "Schoolfellow";

    @Autowired
    public MybatisStudentInfoRepository(StudentInfoMapper studentInfoMapper, StudentInfoDOConverter studentInfoDOConverter, SchoolDOConverter schoolDOConverter, RedisUtil redisUtil) {
        this.studentInfoMapper = studentInfoMapper;
        this.studentInfoDOConverter = studentInfoDOConverter;
        this.schoolDOConverter = schoolDOConverter;
        this.redisUtil = redisUtil;
    }

    @Override
    public List<StudentInfo> getStudentInfos(String schoolfellowId) {
        Object o = redisUtil.get(redisUtil.converModuleAndID2Key(CUR_MODULE,schoolfellowId));
        List<Object> os = redisUtil.lGetAll(redisUtil.converModuleAndID2Key(CUR_MODULE,schoolfellowId));

        List<StudentInfoDO> studentInfoDOS;
        if(o == null){
            studentInfoDOS = studentInfoMapper.getStudentInfos(schoolfellowId);
        }else {
            studentInfoDOS = (List)os;
        }
        return studentInfoDOConverter.dos2dtos(studentInfoDOS);
    }

    @Override
    public School getSchool(String id) {
        return schoolDOConverter.do2dto(studentInfoMapper.getSchool(id));
    }
}
