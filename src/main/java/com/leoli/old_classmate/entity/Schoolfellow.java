package com.leoli.old_classmate.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Schoolfellow implements Serializable, ReturnResult {
    String name;
    int age;
    String sexy; //男 1， 女 0
    private String id;
    private List<StudentInfo> studentInfos;
}
