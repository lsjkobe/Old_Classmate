package com.leoli.old_classmate.dao.converter;

import com.leoli.old_classmate.dao.DO.AuthDO;
import com.leoli.old_classmate.model.entity.Auth;
import org.springframework.stereotype.Component;

@Component
public class AuthDOConverter extends AbstractDOConverter<Auth, AuthDO> {
    @Override
    public AuthDO dto2do(Auth auth) {
        AuthDO authDO = new AuthDO();
        authDO.setId(auth.getId());
        authDO.setUsername(auth.getUsername());
        authDO.setAuthority(auth.getAuthority());
        authDO.setCreatedOn(auth.getCreatedOn());
        authDO.setUpdatedOn(auth.getUpdatedOn());
        return authDO;
    }

    @Override
    public Auth do2dto(AuthDO authDO) {
        Auth.AuthBuilder builder = Auth.builder()
                .id(authDO.getId())
                .username(authDO.getUsername())
                .authority(authDO.getAuthority())
                .createdOn(authDO.getCreatedOn())
                .updatedOn(authDO.getUpdatedOn());
        return builder.build();
    }
}
