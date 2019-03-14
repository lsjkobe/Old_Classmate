package com.leoli.old_classmate.model.converter;// Copyright (c) 1998-2019 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2019-XX-XX, leo.li, creation
// ============================================================================

import java.util.List;

public interface DTOConverter <D, R> {
    D vo2dto(R r);
    List<D> vos2dtos(List<R> rs);

    R dto2vo(D d);
    List<R> dtos2vos(List<D> ds);
}
