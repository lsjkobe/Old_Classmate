package com.leoli.old_classmate.dao.DO;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class AuthDO {
    private String id;
    private String username;
    private String authority;
    private Timestamp createdOn;
    private Timestamp updatedOn;
}
