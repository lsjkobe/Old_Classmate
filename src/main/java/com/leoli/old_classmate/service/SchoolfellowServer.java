package com.leoli.old_classmate.service;

import com.leoli.old_classmate.entity.Schoolfellow;
import org.springframework.stereotype.Service;

@Service
public interface SchoolfellowServer {
    Schoolfellow getSchoolfellowById(String id);
    void saveSchoolfellowById(Schoolfellow schoolfellow);
}
