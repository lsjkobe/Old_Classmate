package com.leoli.old_classmate.mapper;

import com.leoli.old_classmate.dao.DO.AuthDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface AuthMapper {
    void saveAuth(AuthDO authDO);
}
