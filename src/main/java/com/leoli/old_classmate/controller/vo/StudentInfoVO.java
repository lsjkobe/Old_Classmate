package com.leoli.old_classmate.controller.vo;// Copyright (c) 1998-2019 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2019-XX-XX, leo.li, creation
// ============================================================================

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

@Builder
@Data
public class StudentInfoVO {
    private String id;
    private Timestamp createdOn;
    private Timestamp updatedOn;
    private Timestamp startDate;
    private Timestamp endDate;
    private String grade;
    private String schoolfellowId;
    private SchoolVO school;
    private SchoolClassVO sClass;
}
