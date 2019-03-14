package com.leoli.old_classmate.dao.converter;// Copyright (c) 1998-2019 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2019-XX-XX, leo.li, creation
// ============================================================================


import com.leoli.old_classmate.dao.DO.StudentInfoDO;
import com.leoli.old_classmate.model.entity.StudentInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentInfoDOConverter extends AbstractDOConverter<StudentInfo, StudentInfoDO> {

    private final SchoolDOConverter schoolDOConverter;

    private final SchoolClassDOConverter schoolClassDOConverter;

    @Autowired
    public StudentInfoDOConverter(SchoolDOConverter schoolDOConverter, SchoolClassDOConverter schoolClassDOConverter) {
        this.schoolDOConverter = schoolDOConverter;
        this.schoolClassDOConverter = schoolClassDOConverter;
    }

    @Override
    public StudentInfoDO dto2do(StudentInfo studentInfo) {
        StudentInfoDO studentInfoDO = new StudentInfoDO();
        studentInfoDO.setId(studentInfo.getId());
        studentInfoDO.setGrade(studentInfo.getGrade());
        studentInfoDO.setSchoolfellowId(studentInfo.getSchoolfellowId());
        studentInfoDO.setCreatedOn(studentInfo.getCreatedOn());
        studentInfoDO.setUpdatedOn(studentInfo.getUpdatedOn());
        studentInfoDO.setStartDate(studentInfo.getStartDate());
        studentInfoDO.setEndDate(studentInfo.getEndDate());
        studentInfoDO.setSchool(schoolDOConverter.dto2do(studentInfo.getSchool()));
        studentInfoDO.setSClass(schoolClassDOConverter.dto2do(studentInfo.getSClass()));
        return null;
    }

    @Override
    public StudentInfo do2dto(StudentInfoDO studentInfoDO) {
        if (studentInfoDO == null) {
            return null;
        }
        StudentInfo.StudentInfoBuilder builder = StudentInfo.builder()
                .id(studentInfoDO.getId())
                .grade(studentInfoDO.getGrade())
                .createdOn(studentInfoDO.getCreatedOn())
                .updatedOn(studentInfoDO.getUpdatedOn())
                .startDate(studentInfoDO.getStartDate())
                .endDate(studentInfoDO.getEndDate())
                .schoolfellowId(studentInfoDO.getSchoolfellowId())
                .school(schoolDOConverter.do2dto(studentInfoDO.getSchool()))
                .sClass(schoolClassDOConverter.do2dto(studentInfoDO.getSClass()));
        return builder.build();
    }
}
