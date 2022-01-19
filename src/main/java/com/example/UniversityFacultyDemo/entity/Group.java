
package com.example.UniversityFacultyDemo.entity;

import javax.persistence.*;

@Entity
@Table(name = "groups")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "grp_id")
    private long grpId;

    @ManyToOne
    @JoinColumn(name = "dept_id")
    private Department department;

    public Group() {
    }

    public Group(long grpId) {
        this.grpId = grpId;
    }

    public long getGrpId() {
        return grpId;
    }

    public void setGrpId(long grpId) {
        this.grpId = grpId;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String
    toString() {
        return "Group{" +
                "grpId=" + grpId +
                ", department=" + department +
                '}';
    }
}