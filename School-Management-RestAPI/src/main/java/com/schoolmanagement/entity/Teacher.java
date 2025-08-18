package com.schoolmanagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String teacherName;
    private String teacherAddress;

    @Enumerated(EnumType.STRING)
    private Qualification qualification;

    public enum Qualification {
        BSC, MSC, PHD, BTECH, MTECH
    }

    private int age;
    private LocalDate dob;
    private int experience;

    // ✅ Custom constructor without id (JPA will generate id automatically)
    public Teacher(String teacherName, String teacherAddress, Qualification qualification,
                   int age, LocalDate dob, int experience) {
        this.teacherName = teacherName;
        this.teacherAddress = teacherAddress;
        this.qualification = qualification;
        this.age = age;
        this.dob = dob;
        this.experience = experience;
    }

    public Teacher() {
    	
    }
    // Getters & setters (already included via Lombok, but you added manually too)
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getTeacherName() {
        return teacherName;
    }
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
    public String getTeacherAddress() {
        return teacherAddress;
    }
    public void setTeacherAddress(String teacherAddress) {
        this.teacherAddress = teacherAddress;
    }
    public Qualification getQualification() {
        return qualification;
    }
    public void setQualification(Qualification qualification) {
        this.qualification = qualification;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }
}
