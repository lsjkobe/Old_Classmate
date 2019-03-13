package com.leoli.old_classmate.entity;


import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class SchoolClass implements Serializable {
    private String id;
    private String name;
}
