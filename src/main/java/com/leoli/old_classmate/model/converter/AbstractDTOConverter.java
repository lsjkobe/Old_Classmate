package com.leoli.old_classmate.model.converter;// Copyright (c) 1998-2019 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2019-XX-XX, leo.li, creation
// ============================================================================


import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractDTOConverter<D, R> implements DTOConverter<D, R>{

    @Override
    public List<D> vos2dtos(List<R> rs){
        List<D> list = new ArrayList<>();
        if(CollectionUtils.isEmpty(rs)){
            return list;
        }
        rs.forEach(r -> {
            list.add(vo2dto(r));
        });
        return list;
    }

    @Override
    public List<R> dtos2vos(List<D> ds) {
        List<R> list = new ArrayList<>();
        if(CollectionUtils.isEmpty(ds)){
            return list;
        }
        ds.forEach(d -> {
            list.add(dto2vo(d));
        });
        return list;
    }
}
