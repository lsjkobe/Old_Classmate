package com.leoli.old_classmate.service;

import com.leoli.old_classmate.controller.vo.SchoolfellowVO;
import org.springframework.stereotype.Service;

@Service
public interface SchoolfellowServer {
    SchoolfellowVO getSchoolfellowById(String id);
    void saveSchoolfellowById(SchoolfellowVO schoolfellowVO);
}
