package com.leoli.old_classmate.serviceImpl;

import com.leoli.old_classmate.entity.Schoolfellow;
import com.leoli.old_classmate.mapper.SchoolfellowMapper;
import com.leoli.old_classmate.service.SchoolfellowServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolfellowServerImpl implements SchoolfellowServer {

    @Autowired
    public SchoolfellowMapper schoolfellowMapper;

    @Override
    public Schoolfellow getSchoolfellowById(String id) {
        return schoolfellowMapper.getSchoolfellowById(id);
    }
}
