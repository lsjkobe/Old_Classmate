package com.leoli.old_classmate.security.auth;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class PasswordEncryptionProvider {

    private PasswordEncoder passwordEncoder;

    private EncodeType encodeType;

    /**
     * PasswordEncoder和encodeType必须同时设置
     * @return
     */
    public PasswordEncoder getPasswordEncoder() {
        return passwordEncoder;
    }

    public void setPasswordEncoder(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }


    public EncodeType getEncodeType() {
        return encodeType;
    }

    /**
     * PasswordEncoder和encodeType必须同时设置
     * @return
     */
    public void setEncodeType(EncodeType encodeType) {
        this.encodeType = encodeType;
    }

    public PasswordEncryptionProvider() {
//        this.setPasswordEncoder(PasswordEncoderFactories.createDelegatingPasswordEncoder());
        this(new BCryptPasswordEncoder());
    }

    public PasswordEncryptionProvider(PasswordEncoder passwordEncoder) {
//        this.setPasswordEncoder(PasswordEncoderFactories.createDelegatingPasswordEncoder());
        this.setPasswordEncoder(passwordEncoder);
        this.setEncodeType(EncodeType.BCRYPT);
    }

    public String encode(String str){
        return this.passwordEncoder.encode(str);
    }

    public String encodeAndType(String str){
        return "{"+this.encodeType.getEncodingId() + "}"+this.passwordEncoder.encode(str);
    }
}
