package edu.miu.cs.cs499.demos.studentrecordsmgmtapp.model;

import java.time.LocalDate;

public class Student {
    private int studentId;
    private  String name;
    private LocalDate dateOfAdmission;

    public Student(int studentId, String name, LocalDate dateOfAdmission) {
        this.studentId = studentId;
        this.name = name;
        this.dateOfAdmission = dateOfAdmission;
    }

    public Student() {
       this.dateOfAdmission=LocalDate.now();
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.dateOfAdmission=LocalDate.now();
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfAdmission() {
        return dateOfAdmission;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", dateOfAdmission=" + dateOfAdmission +
                '}';
    }
}
