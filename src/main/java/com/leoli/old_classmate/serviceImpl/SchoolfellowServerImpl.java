package com.leoli.old_classmate.serviceImpl;

import com.leoli.old_classmate.controller.vo.SchoolfellowVO;
import com.leoli.old_classmate.model.entity.Schoolfellow;
import com.leoli.old_classmate.mapper.SchoolfellowMapper;
import com.leoli.old_classmate.model.converter.SchoolfellowDTOConverter;
import com.leoli.old_classmate.model.repository.SchoolfellowRepository;
import com.leoli.old_classmate.service.SchoolfellowServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolfellowServerImpl implements SchoolfellowServer {


    private final SchoolfellowDTOConverter schoolfellowDTOConverter;

    private final SchoolfellowRepository schoolfellowRepository;

    @Autowired
    public SchoolfellowServerImpl(SchoolfellowDTOConverter schoolfellowDTOConverter, SchoolfellowRepository schoolfellowRepository) {
        this.schoolfellowDTOConverter = schoolfellowDTOConverter;
        this.schoolfellowRepository = schoolfellowRepository;
    }

    @Override
    public SchoolfellowVO getSchoolfellowById(String id) {
        return schoolfellowDTOConverter.dto2vo(schoolfellowRepository.getSchoolfellowById(id));
    }

    @Override
    public void saveSchoolfellowById(SchoolfellowVO schoolfellowVO) {
        Schoolfellow schoolfellow = schoolfellowDTOConverter.vo2dto(schoolfellowVO);
        schoolfellowRepository.saveSchoolfellow(schoolfellow);
//        schoolfellowMapper.saveSchoolfellow(schoolfellowVO);
    }
}
