package com.leoli.old_classmate.dao.DO;// Copyright (c) 1998-2019 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2019-XX-XX, leo.li, creation
// ============================================================================


import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

@Data
public class SchoolfellowDO {
    private String id;
    private Timestamp createdOn;
    private Timestamp updatedOn;
    String name;
    int age;
    String sexy; //男 1， 女 0
    private List<StudentInfoDO> studentInfos;
}
