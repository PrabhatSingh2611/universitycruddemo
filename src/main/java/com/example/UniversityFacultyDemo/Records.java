package com.example.UniversityFacultyDemo;

public class Records {

    private String studName;
    private String studSurname;
    private int studAge;
    private String studGender;
    private String subName;
    private int marks;

    public Records() {
    }

    public Records(String studName, String studSurname, int studAge, String studGender, String subName, int marks) {
        this.studName = studName;
        this.studSurname = studSurname;
        this.studAge = studAge;
        this.studGender = studGender;
        this.subName = subName;
        this.marks = marks;
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

    public int getStudAge() {
        return studAge;
    }

    public void setStudAge(int studAge) {
        this.studAge = studAge;
    }

    public String getStudGender() {
        return studGender;
    }

    public void setStudGender(String studGender) {
        this.studGender = studGender;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public int getMarkss() {
        return marks;
    }

    public void setMarkss(int markss) {
        this.marks = markss;
    }
}
