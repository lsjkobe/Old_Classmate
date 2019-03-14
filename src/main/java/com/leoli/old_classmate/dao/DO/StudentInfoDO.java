package com.leoli.old_classmate.dao.DO;// Copyright (c) 1998-2019 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2019-XX-XX, leo.li, creation
// ============================================================================



import lombok.Data;

import java.sql.Timestamp;

@Data
public class StudentInfoDO {
    private String id;
    private Timestamp createdOn;
    private Timestamp updatedOn;
    private Timestamp startDate;
    private Timestamp endDate;
    private String grade;
    private String schoolfellowId;
    private SchoolDO school;
    private SchoolClassDO sClass;
}
