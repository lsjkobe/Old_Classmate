package com.leoli.old_classmate.entity;


import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

//@Builder
@Data
public class StudentInfo implements Serializable, ReturnResult {
    private String id;
    private Date startDate;
    private Date endDate;
    private String grade;
    private String schoolfellowId;
    private School school;
    private SchoolClass sClass;
}
