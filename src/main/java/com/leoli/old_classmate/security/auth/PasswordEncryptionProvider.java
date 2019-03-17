package com.leoli.old_classmate.security.auth;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordEncryptionProvider {

    private PasswordEncoder passwordEncoder;

    public PasswordEncoder getPasswordEncoder() {
        return passwordEncoder;
    }

    public void setPasswordEncoder(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    public PasswordEncryptionProvider() {
//        this.setPasswordEncoder(PasswordEncoderFactories.createDelegatingPasswordEncoder());
        this(new BCryptPasswordEncoder());
    }

    public PasswordEncryptionProvider(PasswordEncoder passwordEncoder) {
//        this.setPasswordEncoder(PasswordEncoderFactories.createDelegatingPasswordEncoder());
        this.setPasswordEncoder(passwordEncoder);
    }

    public String encode(String str){
        return this.passwordEncoder.encode(str);
    }
}
