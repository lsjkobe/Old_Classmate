package com.leoli.old_classmate.entity;

import lombok.*;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
//@Builder(toBuilder = true)
public class Schoolfellow extends BaseEntity implements Serializable, ReturnResult {
    String name;
    int age;
    String sexy; //男 1， 女 0
    private List<StudentInfo> studentInfos;
}
