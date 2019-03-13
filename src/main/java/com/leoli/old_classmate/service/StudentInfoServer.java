package com.leoli.old_classmate.service;// Copyright (c) 1998-2019 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2019-XX-XX, leo.li, creation
// ============================================================================


import com.leoli.old_classmate.entity.StudentInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentInfoServer {
    List<StudentInfo> getStudentInfos(String schoolfellowId);
}
