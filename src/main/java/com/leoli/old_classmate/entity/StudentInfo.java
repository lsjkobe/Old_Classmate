package com.leoli.old_classmate.entity;


import java.io.Serializable;
import java.sql.Timestamp;


public class StudentInfo implements Serializable, Cloneable {
    String id;
    Timestamp startDate;
    Timestamp endDate;
    String grade;
    School school;
    SchoolClass sClass;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public SchoolClass getsClass() {
        return sClass;
    }

    public void setsClass(SchoolClass sClass) {
        this.sClass = sClass;
    }
}
