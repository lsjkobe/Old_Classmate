package com.leoli.old_classmate.model.converter;// Copyright (c) 1998-2019 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2019-XX-XX, leo.li, creation
// ============================================================================


import com.leoli.old_classmate.controller.vo.SchoolClassVO;
import com.leoli.old_classmate.model.entity.SchoolClass;
import org.springframework.stereotype.Component;

@Component
public class SchoolClassDTOConverter extends AbstractDTOConverter<SchoolClass, SchoolClassVO> {
    @Override
    public SchoolClass vo2dto(SchoolClassVO schoolClassVO) {
        if (schoolClassVO == null) {
            return null;
        }
        SchoolClass.SchoolClassBuilder builder = SchoolClass.builder()
                .id(schoolClassVO.getId())
                .name(schoolClassVO.getName())
                .createdOn(schoolClassVO.getCreatedOn())
                .updatedOn(schoolClassVO.getUpdatedOn());
        return builder.build();
    }

    @Override
    public SchoolClassVO dto2vo(SchoolClass schoolClass) {
        if(schoolClass == null){
            return null;
        }
        SchoolClassVO.SchoolClassVOBuilder builder = SchoolClassVO.builder()
                .id(schoolClass.getId())
                .name(schoolClass.getName())
                .createdOn(schoolClass.getCreatedOn())
                .updatedOn(schoolClass.getUpdatedOn());
        return builder.build();
    }
}
