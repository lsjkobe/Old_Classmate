package com.leoli.old_classmate.model.entity;


import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;

@Builder()
@Data
public class StudentInfo implements Serializable {
    private String id;
    private Timestamp createdOn;
    private Timestamp updatedOn;
    private Timestamp startDate;
    private Timestamp endDate;
    private String grade;
    private String schoolfellowId;
    private School school;
    private SchoolClass sClass;
}
