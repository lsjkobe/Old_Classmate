package com.leoli.old_classmate.serviceImpl;

import com.leoli.old_classmate.entity.Schoolfellow;
import com.leoli.old_classmate.mapper.SchoolfellowMapper;
import com.leoli.old_classmate.service.SchoolfellowServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolfellowServerImpl implements SchoolfellowServer {

    private final SchoolfellowMapper schoolfellowMapper;

    @Autowired
    public SchoolfellowServerImpl(SchoolfellowMapper schoolfellowMapper) {
        this.schoolfellowMapper = schoolfellowMapper;
    }

    @Override
    public Schoolfellow getSchoolfellowById(String id) {
        return schoolfellowMapper.getSchoolfellowById(id);
    }
}
