package com.leoli.old_classmate.security.auth;

/**
 * 和PasswordEncoderFactories.PasswordEncoder里的encodingId
 */
public enum EncodeType {
    BCRYPT("bcrypt", true),
    LDAP("ldap", true),
    MD4("MD4", true),
    MD5("MD5", true),
    NOOP("noop", true),
    PBKDF2("pbkdf2", true),
    SCRYPT("scrypt", true),
    SHA_1("SHA-1", true),
    SHA_256("SHA-256", true),
    SHA256("sha256", true);

    private String encodingId;

    private boolean enable;

    EncodeType(String encodingId, boolean enable) {
        this.encodingId = encodingId;
        this.enable = enable;
    }

    public String getEncodingId() {
        return encodingId;
    }

    public void setEncodingId(String encodingId) {
        this.encodingId = encodingId;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }}
