package com.leoli.old_classmate.model.repository;// Copyright (c) 1998-2019 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2019-XX-XX, leo.li, creation
// ============================================================================

import com.leoli.old_classmate.model.entity.Schoolfellow;

public interface SchoolfellowRepository {
    Schoolfellow getSchoolfellowById(String id);
    void saveSchoolfellow(Schoolfellow schoolfellow);
}
