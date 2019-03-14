package com.leoli.old_classmate.dao.converter;// Copyright (c) 1998-2019 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2019-XX-XX, leo.li, creation
// ============================================================================


import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractDOConverter<dto, d> implements DOConverter<dto, d> {
    @Override
    public List<d> dtos2dos(List<dto> dtos) {
        List<d> ds = new ArrayList<>();
        if(CollectionUtils.isEmpty(dtos)){
            return ds;
        }
        dtos.forEach(dto -> {
            ds.add(dto2do(dto));
        });
        return ds;
    }

    @Override
    public List<dto> dos2dtos(List<d> ds) {
        List<dto> dtos = new ArrayList<>();
        if(CollectionUtils.isEmpty(ds)){
            return dtos;
        }
        ds.forEach(d -> {
            dtos.add(do2dto(d));
        });
        return dtos;
    }
}
