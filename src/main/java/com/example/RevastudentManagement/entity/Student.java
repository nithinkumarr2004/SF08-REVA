package com.example.RevastudentManagement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "StudentRecord")
@Table(name = "student_records")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    private String id;
    private String name;
    private String roll;
    private String usn;
    private String college;
    private String branch;
    private String course;
    private String year;
    private String hallTicketNo;
}
