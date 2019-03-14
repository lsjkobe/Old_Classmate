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

@Data
@Builder
public class SchoolVO {
    private String id;
    private Timestamp createdOn;
    private Timestamp updatedOn;
    private String name;
}
