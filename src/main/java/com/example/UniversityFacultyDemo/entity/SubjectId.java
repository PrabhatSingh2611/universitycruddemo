package com.example.UniversityFacultyDemo.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class SubjectId implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
            @Column(name = "sub_id")
    int subId;
@Column(name = "marks")
    int marks;

    public SubjectId() {
    }

    public SubjectId(int subId, int marks) {
        this.subId = subId;
        this.marks = marks;
    }

    public int getSubId() {
        return subId;
    }

    public void setSubId(int subId) {
        this.subId = subId;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

  /*  @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    if (o == null || getClass() != o.getClass())
        return false;

    SubjectId subjectId = (SubjectId) o;
    if (subjectId != null ?!subjectId.equals(subjectId.subId) :
    subjectId.subId != null) return false ;
    return marks != null ? marks.equals(subjectId.marks) :
            subjectId.subId == null;

    }
*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SubjectId)) return false;
        SubjectId subjectId = (SubjectId) o;
        return subId == subjectId.subId && marks == subjectId.marks;
    }

    @Override
    public int hashCode() {
        return Objects.hash(subId, marks);
    }
}
