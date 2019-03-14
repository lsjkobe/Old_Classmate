package com.leoli.old_classmate.mapper;// Copyright (c) 1998-2019 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2019-XX-XX, leo.li, creation
// ============================================================================


import com.leoli.old_classmate.dao.DO.SchoolDO;
import com.leoli.old_classmate.dao.DO.StudentInfoDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface StudentInfoMapper {
    List<StudentInfoDO> getStudentInfos(@Param("id") String id);
    SchoolDO getSchool(@Param("id") String id);
}
