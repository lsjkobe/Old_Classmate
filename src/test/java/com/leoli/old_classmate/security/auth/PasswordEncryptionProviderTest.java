package com.leoli.old_classmate.security.auth;

import com.leoli.old_classmate.OldClassmateApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = OldClassmateApplication.class)
@Transactional
@Rollback
public class PasswordEncryptionProviderTest {

    @Test
    public void passwordEncryptionProvider(){
        PasswordEncryptionProvider provider = new PasswordEncryptionProvider();
        String str = provider.encode("123456");
        System.out.println(str);
    }

}