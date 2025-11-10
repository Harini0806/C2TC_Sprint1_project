package com.tnsif.CollegeService.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "college")
public class College {

    @Id
    @Column(name = "college_id")
    private int collegeId;

    @Column(name = "college_name")
    private String collegeName;

    @Column(name = "college_location")
    private String collegeLocation;

    @Column(name = "college_email")
    private String collegeEmail;

    @Column(name = "college_phone")
    private String collegePhone;

    @Column(name = "college_type")
    private String collegeType;

    @Column(name = "student_count")
    private int studentCount;

    public College() {}

    public College(int collegeId, String collegeName, String collegeLocation, String collegeEmail,
                   String collegePhone, String collegeType, int studentCount) {
        this.collegeId = collegeId;
        this.collegeName = collegeName;
        this.collegeLocation = collegeLocation;
        this.collegeEmail = collegeEmail;
        this.collegePhone = collegePhone;
        this.collegeType = collegeType;
        this.studentCount = studentCount;
    }

    // Getters & Setters
    public int getCollegeId() { return collegeId; }
    public void setCollegeId(int collegeId) { this.collegeId = collegeId; }

    public String getCollegeName() { return collegeName; }
    public void setCollegeName(String collegeName) { this.collegeName = collegeName; }

    public String getCollegeLocation() { return collegeLocation; }
    public void setCollegeLocation(String collegeLocation) { this.collegeLocation = collegeLocation; }

    public String getCollegeEmail() { return collegeEmail; }
    public void setCollegeEmail(String collegeEmail) { this.collegeEmail = collegeEmail; }

    public String getCollegePhone() { return collegePhone; }
    public void setCollegePhone(String collegePhone) { this.collegePhone = collegePhone; }

    public String getCollegeType() { return collegeType; }
    public void setCollegeType(String collegeType) { this.collegeType = collegeType; }

    public int getStudentCount() { return studentCount; }
    public void setStudentCount(int studentCount) { this.studentCount = studentCount; }

    @Override
    public String toString() {
        return "College [collegeId=" + collegeId + ", collegeName=" + collegeName +
                ", collegeLocation=" + collegeLocation + ", collegeEmail=" + collegeEmail +
                ", collegePhone=" + collegePhone + ", collegeType=" + collegeType +
                ", studentCount=" + studentCount + "]";
    }
}

