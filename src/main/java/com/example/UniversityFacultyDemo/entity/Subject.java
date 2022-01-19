package com.example.UniversityFacultyDemo.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "subject")
public class Subject {

    @Id
    @Column(name = "subId")
    private long subId;
    @Column(name = "sub_name")
    private String subName;
    @Column(name = "marks")
    private Integer marks;



    public Subject() {
    }

    public Subject(long subId, String subName, Integer marks) {
        this.subId = subId;
        this.subName = subName;
        this.marks = marks;
    }

    public long getSubId() {
        return subId;
    }

    public void setSubId(long subId) {
        this.subId = subId;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subId=" + subId +
                ", subName='" + subName + '\'' +
                ", marks=" + marks +
                '}';
    }

   /* public List<Object> getStudentEnrolled() {
        return null;
    }*/
}
