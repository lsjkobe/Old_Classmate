package com.leoli.old_classmate.dao.converter;// Copyright (c) 1998-2019 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2019-XX-XX, leo.li, creation
// ============================================================================


import java.util.List;

public interface DOConverter<dto, d> {
    d dto2do(dto dto);
    List<d> dtos2dos(List<dto> dtos);

    dto do2dto(d d);
    List<dto> dos2dtos(List<d> ds);

}
