package com.leoli.old_classmate.model.entity;

import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

@Data
@Builder
public class Schoolfellow implements Serializable {
    private String id;
    private Timestamp createdOn;
    private Timestamp updatedOn;
    String password;
    String name;
    int age;
    String sexy; //男 1， 女 0
    private List<StudentInfo> studentInfos;
}
