package com.leoli.old_classmate.mapper;

import com.leoli.old_classmate.entity.Schoolfellow;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface SchoolfellowMapper {
    Schoolfellow getSchoolfellowById(@Param("id") String id);
}
