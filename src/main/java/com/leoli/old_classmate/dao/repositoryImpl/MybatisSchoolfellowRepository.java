package com.leoli.old_classmate.dao.repositoryImpl;// Copyright (c) 1998-2019 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2019-XX-XX, leo.li, creation
// ============================================================================


import com.leoli.old_classmate.dao.DO.SchoolfellowDO;
import com.leoli.old_classmate.dao.converter.SchoolfellowDOConverter;
import com.leoli.old_classmate.mapper.SchoolfellowMapper;
import com.leoli.old_classmate.model.entity.Schoolfellow;
import com.leoli.old_classmate.model.repository.SchoolfellowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MybatisSchoolfellowRepository implements SchoolfellowRepository {

    private final SchoolfellowMapper schoolfellowMapper;

    private final SchoolfellowDOConverter schoolfellowDOConverter;

    @Autowired
    public MybatisSchoolfellowRepository(SchoolfellowMapper schoolfellowMapper, SchoolfellowDOConverter schoolfellowDOConverter) {
        this.schoolfellowMapper = schoolfellowMapper;
        this.schoolfellowDOConverter = schoolfellowDOConverter;
    }

    @Override
    public Schoolfellow getSchoolfellowById(String id) {
        SchoolfellowDO schoolfellowDO = schoolfellowMapper.getSchoolfellowById(id);
        return schoolfellowDOConverter.do2dto(schoolfellowDO);
    }

    @Override
    public void saveSchoolfellow(Schoolfellow schoolfellow) {
        schoolfellowMapper.saveSchoolfellow(schoolfellowDOConverter.dto2do(schoolfellow));
    }
}
