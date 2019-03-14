package com.leoli.old_classmate.model.converter;// Copyright (c) 1998-2019 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2019-XX-XX, leo.li, creation
// ============================================================================


import com.leoli.old_classmate.controller.vo.SchoolVO;
import com.leoli.old_classmate.model.entity.School;
import org.springframework.stereotype.Component;

@Component
public class SchoolDTOConverter extends AbstractDTOConverter<School, SchoolVO> {

    @Override
    public School vo2dto(SchoolVO schoolVO) {
        if (schoolVO == null) {
            return null;
        }
        School.SchoolBuilder builder = School.builder()
                .id(schoolVO.getId())
                .name(schoolVO.getName())
                .createdOn(schoolVO.getCreatedOn())
                .updatedOn(schoolVO.getUpdatedOn());
        return builder.build();
    }

    @Override
    public SchoolVO dto2vo(School school) {
        if(school == null){
            return null;
        }
        SchoolVO.SchoolVOBuilder builder = SchoolVO.builder()
                .id(school.getId())
                .name(school.getName())
                .createdOn(school.getCreatedOn())
                .updatedOn(school.getUpdatedOn());
        return builder.build();
    }
}
