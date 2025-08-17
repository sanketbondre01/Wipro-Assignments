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
}