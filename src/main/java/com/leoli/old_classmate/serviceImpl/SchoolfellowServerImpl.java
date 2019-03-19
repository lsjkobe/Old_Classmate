package com.leoli.old_classmate.serviceImpl;

import com.leoli.old_classmate.controller.vo.SchoolfellowVO;
import com.leoli.old_classmate.model.entity.Auth;
import com.leoli.old_classmate.model.entity.Schoolfellow;
import com.leoli.old_classmate.model.converter.SchoolfellowDTOConverter;
import com.leoli.old_classmate.model.repository.SchoolfellowRepository;
import com.leoli.old_classmate.security.auth.PasswordEncryptionProvider;
import com.leoli.old_classmate.service.SchoolfellowServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.UUID;

@Service
public class SchoolfellowServerImpl implements SchoolfellowServer {


    private final SchoolfellowDTOConverter schoolfellowDTOConverter;

    private final SchoolfellowRepository schoolfellowRepository;

    @Autowired
    PasswordEncryptionProvider encryptionProvider;

    @Autowired
    public SchoolfellowServerImpl(SchoolfellowDTOConverter schoolfellowDTOConverter, SchoolfellowRepository schoolfellowRepository) {
        this.schoolfellowDTOConverter = schoolfellowDTOConverter;
        this.schoolfellowRepository = schoolfellowRepository;
    }

    @Override
    public SchoolfellowVO getSchoolfellowById(String id) {
        return schoolfellowDTOConverter.dto2vo(schoolfellowRepository.getSchoolfellowById(id));
    }

    @Transactional
    @Override
    public void saveSchoolfellowById(SchoolfellowVO schoolfellowVO) {
        Schoolfellow schoolfellow = schoolfellowDTOConverter.vo2dto(schoolfellowVO);
        if(StringUtils.isEmpty(schoolfellow.getId())){
            schoolfellow.setId(UUID.randomUUID().toString());
        }
        schoolfellow.setPassword(encryptionProvider.encodeAndType(schoolfellow.getPassword()));
        schoolfellowRepository.saveSchoolfellow(schoolfellow);
        schoolfellowRepository.saveAuth(constructAuth(schoolfellow.getName(), "USER"));
    }

    private Auth constructAuth(String username,String auth){
        Auth.AuthBuilder builder = Auth.builder()
                .id(UUID.randomUUID().toString())
                .username(username)
                .authority(auth)
                .updatedOn(new Timestamp(Calendar.getInstance().getTimeInMillis()))
                .createdOn(new Timestamp(Calendar.getInstance().getTimeInMillis()));
        return builder.build();
    }
}
