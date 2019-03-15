package com.leoli.old_classmate.dao.repositoryImpl;// Copyright (c) 1998-2019 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2019-XX-XX, leo.li, creation
// ============================================================================


import com.leoli.old_classmate.common.utils.RedisUtil;
import com.leoli.old_classmate.dao.DO.SchoolfellowDO;
import com.leoli.old_classmate.dao.converter.SchoolfellowDOConverter;
import com.leoli.old_classmate.mapper.SchoolfellowMapper;
import com.leoli.old_classmate.model.entity.Schoolfellow;
import com.leoli.old_classmate.model.repository.SchoolfellowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MybatisSchoolfellowRepository implements SchoolfellowRepository {

    private final String CUR_MODULE = "Schoolfellow";

    private final SchoolfellowMapper schoolfellowMapper;

    private final SchoolfellowDOConverter schoolfellowDOConverter;

    private final RedisUtil redisUtil;

    @Autowired
    public MybatisSchoolfellowRepository(SchoolfellowMapper schoolfellowMapper, SchoolfellowDOConverter schoolfellowDOConverter, RedisUtil redisUtil) {
        this.schoolfellowMapper = schoolfellowMapper;
        this.schoolfellowDOConverter = schoolfellowDOConverter;
        this.redisUtil = redisUtil;
    }

    @Override
    public Schoolfellow getSchoolfellowById(String id) {
        Object o = redisUtil.get(redisUtil.converModuleAndID2Key(CUR_MODULE,id));
        SchoolfellowDO schoolfellowDO;
        if (o == null) {
            schoolfellowDO = schoolfellowMapper.getSchoolfellowById(id);
            redisUtil.set(id, schoolfellowDO);
        } else {
            schoolfellowDO = (SchoolfellowDO) o;
        }
        return schoolfellowDOConverter.do2dto(schoolfellowDO);
    }

    @Override
    public void saveSchoolfellow(Schoolfellow schoolfellow) {
        SchoolfellowDO schoolfellowDO = schoolfellowDOConverter.dto2do(schoolfellow);
        schoolfellowMapper.saveSchoolfellow(schoolfellowDO);
        redisUtil.set(redisUtil.converModuleAndID2Key(CUR_MODULE,schoolfellowDO.getId()), schoolfellowDO);
    }


}
