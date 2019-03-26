package com.leoli.old_classmate.serviceImpl;

import com.leoli.old_classmate.OldClassmateApplication;
import com.leoli.old_classmate.security.auth.PasswordEncryptionProvider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
// Copyright (c) 1998-2019 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2019-XX-XX, leo.li, creation
// ============================================================================

@RunWith(SpringRunner.class)
@SpringBootTest(classes = OldClassmateApplication.class)
@Transactional
@Rollback
public class SchoolfellowServerImplTest {

    @Autowired
    PasswordEncryptionProvider encryptionProvider;

    @Test
    public void saveSchoolfellowById() {

        String encode = encryptionProvider.encodeAndType("123456");
        System.out.println(encode);
    }
}