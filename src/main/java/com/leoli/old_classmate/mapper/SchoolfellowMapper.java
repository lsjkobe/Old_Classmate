package com.leoli.old_classmate.mapper;

import com.leoli.old_classmate.controller.vo.SchoolfellowVO;
import com.leoli.old_classmate.dao.DO.SchoolfellowDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface SchoolfellowMapper {

    SchoolfellowDO getSchoolfellowById(@Param("id") String id);
    void saveSchoolfellow(SchoolfellowDO schoolfellowVO);
}
