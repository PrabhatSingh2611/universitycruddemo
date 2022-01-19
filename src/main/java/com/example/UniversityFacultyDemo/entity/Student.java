package com.example.UniversityFacultyDemo.entity;

import javax.persistence.*;

import java.util.List;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @Column(name = "stud_id")
    private long studId;
    @Column(name = "stud_name")
    private String studName;
    @Column(name = "stud_surname")
    private String studSurname;
    @Column(name = "stud_age")
    private int studAge;
    @Column(name = "stud_gender")
    private String studGender;
    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "stud_id")
    private List<Subject> subject;

    public Student(){

    }

    public Student(long studId, String studName, String studSurname,int studAge, String studGender) {
        this.studId = studId;
        this.studName = studName;
        this.studSurname = studSurname;
        this.studAge = studAge;
        this.studGender = studGender;
    }

    public long getStudId() {
        return studId;
    }

    public void setStudId(long studId) {
        this.studId = studId;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public String getStudSurname() {
        return studSurname;
    }

    public void setStudSurname(String studSurname) {
        this.studSurname = studSurname;
    }

    public int getStudAge() { return studAge; }

    public void setStudAge(int studAge) { this.studAge = studAge; }

    public String getStudGender() {
        return studGender;
    }

    public void setStudGender(String studGender) {
        this.studGender = studGender;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public List<Subject> getSubject() {
        return subject;
    }

    public void setSubject(List<Subject> subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studId=" + studId +
                ", studName='" + studName + '\'' +
                ", studSurname='" + studSurname + '\'' +
                ", studAge='" + studAge + '\'' +
                ", studGender='" + studGender + '\'' +
                '}';
    }
}
