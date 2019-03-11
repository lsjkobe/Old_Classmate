package com.leoli.old_classmate.entity;

import java.util.List;

public class Schoolfellow extends People {
    String id;
    List<StudentInfo> studentInfos;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<StudentInfo> getStudentInfos() {
        return studentInfos;
    }

    public void setStudentInfos(List<StudentInfo> studentInfos) {
        this.studentInfos = studentInfos;
    }
}
