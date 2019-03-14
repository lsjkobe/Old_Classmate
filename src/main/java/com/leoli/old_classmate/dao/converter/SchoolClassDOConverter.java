package com.leoli.old_classmate.dao.converter;// Copyright (c) 1998-2019 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2019-XX-XX, leo.li, creation
// ============================================================================


import com.leoli.old_classmate.dao.DO.SchoolClassDO;
import com.leoli.old_classmate.model.entity.SchoolClass;
import org.springframework.stereotype.Component;

@Component
public class SchoolClassDOConverter extends AbstractDOConverter<SchoolClass, SchoolClassDO> {
    @Override
    public SchoolClassDO dto2do(SchoolClass schoolClass) {
        SchoolClassDO classDO = new SchoolClassDO();
        classDO.setId(schoolClass.getId());
        classDO.setName(schoolClass.getName());
        classDO.setCreatedOn(schoolClass.getCreatedOn());
        classDO.setUpdatedOn(schoolClass.getUpdatedOn());
        return classDO;
    }

    @Override
    public SchoolClass do2dto(SchoolClassDO schoolClassDO) {
        if (schoolClassDO == null) {
            return null;
        }
        SchoolClass.SchoolClassBuilder builder = SchoolClass.builder()
                .id(schoolClassDO.getId())
                .name(schoolClassDO.getName())
                .createdOn(schoolClassDO.getCreatedOn())
                .updatedOn(schoolClassDO.getUpdatedOn());
        return builder.build();
    }
}
