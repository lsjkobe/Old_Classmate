package com.leoli.old_classmate.dao.converter;// Copyright (c) 1998-2019 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2019-XX-XX, leo.li, creation
// ============================================================================


import com.leoli.old_classmate.dao.DO.SchoolDO;
import com.leoli.old_classmate.model.entity.School;
import org.springframework.stereotype.Component;

@Component
public class SchoolDOConverter extends AbstractDOConverter<School, SchoolDO> {
    @Override
    public SchoolDO dto2do(School school) {
        SchoolDO schoolDO = new SchoolDO();
        schoolDO.setId(school.getId());
        schoolDO.setName(school.getName());
        schoolDO.setCreatedOn(school.getCreatedOn());
        schoolDO.setUpdatedOn(school.getUpdatedOn());
        return schoolDO;
    }

    @Override
    public School do2dto(SchoolDO schoolDO) {
        if (schoolDO == null) {
            return null;
        }
        School.SchoolBuilder builder = School.builder()
                .id(schoolDO.getId())
                .name(schoolDO.getName())
                .createdOn(schoolDO.getCreatedOn())
                .updatedOn(schoolDO.getUpdatedOn());
        return builder.build();
    }
}
