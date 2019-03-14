package com.leoli.old_classmate.model.converter;// Copyright (c) 1998-2019 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2019-XX-XX, leo.li, creation
// ============================================================================


import com.leoli.old_classmate.controller.vo.StudentInfoVO;
import com.leoli.old_classmate.model.entity.StudentInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentInfoDTOConverter extends AbstractDTOConverter<StudentInfo, StudentInfoVO> {

    private final SchoolDTOConverter schoolDTOConverter;
    private final SchoolClassDTOConverter schoolClassDTOConverter;

    @Autowired
    public StudentInfoDTOConverter(SchoolDTOConverter schoolDTOConverter, SchoolClassDTOConverter schoolClassDTOConverter) {
        this.schoolDTOConverter = schoolDTOConverter;
        this.schoolClassDTOConverter = schoolClassDTOConverter;
    }

    @Override
    public StudentInfo vo2dto(StudentInfoVO studentInfoVO) {
        if (studentInfoVO == null) {
            return null;
        }
        StudentInfo.StudentInfoBuilder builder = StudentInfo.builder()
                .id(studentInfoVO.getId())
                .grade(studentInfoVO.getGrade())
                .createdOn(studentInfoVO.getCreatedOn())
                .updatedOn(studentInfoVO.getUpdatedOn())
                .startDate(studentInfoVO.getStartDate())
                .endDate(studentInfoVO.getEndDate())
                .schoolfellowId(studentInfoVO.getSchoolfellowId())
                .school(schoolDTOConverter.vo2dto(studentInfoVO.getSchool()))
                .sClass(schoolClassDTOConverter.vo2dto(studentInfoVO.getSClass()));
        return builder.build();
    }

    @Override
    public StudentInfoVO dto2vo(StudentInfo studentInfo) {
        if (studentInfo == null) {
            return null;
        }
        StudentInfoVO.StudentInfoVOBuilder builder = StudentInfoVO.builder()
                .id(studentInfo.getId())
                .grade(studentInfo.getGrade())
                .createdOn(studentInfo.getCreatedOn())
                .updatedOn(studentInfo.getUpdatedOn())
                .startDate(studentInfo.getStartDate())
                .endDate(studentInfo.getEndDate())
                .schoolfellowId(studentInfo.getSchoolfellowId())
                .school(schoolDTOConverter.dto2vo(studentInfo.getSchool()))
                .sClass(schoolClassDTOConverter.dto2vo(studentInfo.getSClass()));
        return builder.build();
    }
}
