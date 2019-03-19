package com.leoli.old_classmate.controller.vo;// Copyright (c) 1998-2019 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2019-XX-XX, leo.li, creation
// ============================================================================


import com.leoli.old_classmate.controller.ReturnResult;
import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

@Data
@Builder
public class SchoolfellowVO implements ReturnResult {
    private String id;
    private Timestamp createdOn;
    private Timestamp updatedOn;
    String name;
    String password;
    int age;
    String sexy; //男 1， 女 0
    boolean enable;
    private List<StudentInfoVO> studentInfos;
}
