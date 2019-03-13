package com.leoli.old_classmate.entity;


import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

//@Builder
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentInfo extends BaseEntity implements Serializable, ReturnResult {
//    private Timestamp startDate;
//    private Timestamp endDate;
    private String grade;
    private String schoolfellowId;
    private School school;
    private SchoolClass sClass;
}
