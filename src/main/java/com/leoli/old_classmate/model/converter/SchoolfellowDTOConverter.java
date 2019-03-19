package com.leoli.old_classmate.model.converter;// Copyright (c) 1998-2019 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2019-XX-XX, leo.li, creation
// ============================================================================


import com.leoli.old_classmate.controller.vo.SchoolfellowVO;
import com.leoli.old_classmate.model.entity.Schoolfellow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SchoolfellowDTOConverter extends AbstractDTOConverter<Schoolfellow, SchoolfellowVO> {

    private final StudentInfoDTOConverter studentInfoDTOConverter;

    @Autowired
    public SchoolfellowDTOConverter(StudentInfoDTOConverter studentInfoDTOConverter) {
        this.studentInfoDTOConverter = studentInfoDTOConverter;
    }

    @Override
    public Schoolfellow vo2dto(SchoolfellowVO schoolfellowVO) {
        if (schoolfellowVO == null) {
            return null;
        }
        Schoolfellow.SchoolfellowBuilder builder = Schoolfellow.builder()
                .age(schoolfellowVO.getAge())
                .name(schoolfellowVO.getName())
                .sexy(schoolfellowVO.getSexy())
                .password(schoolfellowVO.getPassword())
                .createdOn(schoolfellowVO.getCreatedOn())
                .updatedOn(schoolfellowVO.getUpdatedOn())
                .studentInfos(studentInfoDTOConverter.vos2dtos(schoolfellowVO.getStudentInfos()));
        return builder.build();
    }

    @Override
    public SchoolfellowVO dto2vo(Schoolfellow schoolfellow) {
        if (schoolfellow == null) {
            return null;
        }
        SchoolfellowVO.SchoolfellowVOBuilder builder = SchoolfellowVO.builder()
                .age(schoolfellow.getAge())
                .name(schoolfellow.getName())
                .sexy(schoolfellow.getSexy())
                .createdOn(schoolfellow.getCreatedOn())
                .updatedOn(schoolfellow.getUpdatedOn())
                .studentInfos(studentInfoDTOConverter.dtos2vos(schoolfellow.getStudentInfos()));
        return builder.build();
    }

}
