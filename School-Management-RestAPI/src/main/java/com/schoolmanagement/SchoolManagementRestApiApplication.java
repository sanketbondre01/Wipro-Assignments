package com.schoolmanagement;

import com.schoolmanagement.entity.School;
import com.schoolmanagement.entity.Teacher;
import com.schoolmanagement.repository.SchoolRepository;
import com.schoolmanagement.repository.TeacherRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class SchoolManagementRestApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(SchoolManagementRestApiApplication.class, args);
    }

    @Bean
    CommandLineRunner loadData(TeacherRepository teacherRepo, SchoolRepository schoolRepo) {
        return args -> {
            // --- Create Teachers ---
            Teacher t1 = new Teacher("Sanket Bondre", "Pune", Teacher.Qualification.PHD, 45, LocalDate.of(1980, 5, 15), 20);
            Teacher t2 = new Teacher("Mohan Mishra", "Mumbai", Teacher.Qualification.MSC, 50, LocalDate.of(1975, 3, 10), 25);
            Teacher t3 = new Teacher("Ram Babu", "Chennai", Teacher.Qualification.BTECH, 38, LocalDate.of(1985, 8, 20), 15);
            Teacher t4 = new Teacher("Mahesh Goswal", "Bangalore", Teacher.Qualification.MTECH, 42, LocalDate.of(1981, 11, 30), 18);
            Teacher t5 = new Teacher("Arjun Rampal", "Delhi", Teacher.Qualification.PHD, 48, LocalDate.of(1977, 4, 5), 22);
            Teacher t6 = new Teacher("Mahesh Shinde", "Pune", Teacher.Qualification.MSC, 34, LocalDate.of(1986, 12, 14), 12);
            Teacher t7 = new Teacher("Gopi Kumar", "Kolkata", Teacher.Qualification.BSC, 40, LocalDate.of(1982, 1, 25), 17);
            Teacher t8 = new Teacher("Venkatesh", "Chennai", Teacher.Qualification.MTECH, 37, LocalDate.of(1983, 9, 12), 14);

            teacherRepo.saveAll(List.of(t1, t2, t3, t4, t5, t6, t7, t8));

            // --- Create Schools (using teacher IDs) ---
            School s1 = new School("SNDT", "Hyderabad", t1.getId());
            School s2 = new School("JWTS Highschool", "Mumbai", t2.getId());
            School s3 = new School("Springfield Academy", "Chennai", t3.getId());
            School s4 = new School("Maple Leaf School", "Bangalore", t4.getId());
            School s5 = new School("Crescent School", "Delhi", t5.getId());
            School s6 = new School("Furguson College", "Pune", t6.getId());
            School s7 = new School("MIT School", "Kolkata", t7.getId());
            School s8 = new School("VIT Acadamy", "Chennai", t8.getId());

            schoolRepo.saveAll(List.of(s1, s2, s3, s4, s5, s6, s7, s8));
        };
    }
}
