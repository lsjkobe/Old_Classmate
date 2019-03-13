package com.leoli.old_classmate.controller;

import com.leoli.old_classmate.OldClassmateApplication;
import com.leoli.old_classmate.entity.Schoolfellow;
import com.leoli.old_classmate.service.SchoolfellowServer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = OldClassmateApplication.class)
@Transactional
@Rollback
public class SchoolfellowControllerTest {

    @Autowired
    private SchoolfellowServer schoolfellowServer;

    @Test
    public void saveSchoolfellow() {
//        Schoolfellow.SchoolfellowBuilder builder = Schoolfellow.builder().id("5").age(26).name("leotest").sexy("1");
//        schoolfellowServer.saveSchoolfellowById(builder.build());
    }
}