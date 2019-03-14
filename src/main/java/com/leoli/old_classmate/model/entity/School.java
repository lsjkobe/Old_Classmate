package com.leoli.old_classmate.model.entity;


import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Builder
public class School implements Serializable {
    private String id;
    private Timestamp createdOn;
    private Timestamp updatedOn;
    private String name;
    
}
