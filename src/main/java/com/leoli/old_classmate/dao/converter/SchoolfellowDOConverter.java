package com.leoli.old_classmate.dao.converter;// Copyright (c) 1998-2019 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2019-XX-XX, leo.li, creation
// ============================================================================


import com.leoli.old_classmate.dao.DO.SchoolfellowDO;
import com.leoli.old_classmate.model.entity.Schoolfellow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SchoolfellowDOConverter extends AbstractDOConverter<Schoolfellow, SchoolfellowDO>{

    private final StudentInfoDOConverter studentInfoDOConverter;

    @Autowired
    public SchoolfellowDOConverter(StudentInfoDOConverter studentInfoDOConverter) {
        this.studentInfoDOConverter = studentInfoDOConverter;
    }

    @Override
    public SchoolfellowDO dto2do(Schoolfellow schoolfellow) {
        if(schoolfellow == null){
            return null;
        }
        SchoolfellowDO schoolfellowDO = new SchoolfellowDO();
        schoolfellowDO.setId(schoolfellow.getId());
        schoolfellowDO.setAge(schoolfellow.getAge());
        schoolfellowDO.setName(schoolfellow.getName());
        schoolfellowDO.setPassword(schoolfellow.getPassword());
        schoolfellowDO.setSexy(schoolfellow.getSexy());
        schoolfellowDO.setCreatedOn(schoolfellow.getCreatedOn());
        schoolfellowDO.setUpdatedOn(schoolfellow.getUpdatedOn());
        return schoolfellowDO;
    }

    @Override
    public Schoolfellow do2dto(SchoolfellowDO schoolfellowDO) {
        if (schoolfellowDO == null) {
            return null;
        }
        Schoolfellow.SchoolfellowBuilder builder = Schoolfellow.builder()
                .age(schoolfellowDO.getAge())
                .name(schoolfellowDO.getName())
                .sexy(schoolfellowDO.getSexy())
                .createdOn(schoolfellowDO.getCreatedOn())
                .updatedOn(schoolfellowDO.getUpdatedOn())
                .studentInfos(studentInfoDOConverter.dos2dtos(schoolfellowDO.getStudentInfos()));
        return builder.build();
    }
}
