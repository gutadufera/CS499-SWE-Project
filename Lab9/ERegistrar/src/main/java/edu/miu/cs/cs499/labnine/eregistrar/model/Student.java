package edu.miu.cs.cs499.labnine.eregistrar.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Date;
import java.util.StringJoiner;
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    @NotNull(message = "student number is required")
    @NotBlank(message = "student number cannot be blank")
    @Column(nullable = false, unique = true)
    private String studentNumber;

    @NotNull(message = "student first name is required")
    @NotBlank(message = "student first name cannot be blank")
    @Column(nullable = false)
    private String firstName;

    @Column(nullable = true)
    private String middleName;

    @NotNull(message = "student last name is required")
    @NotBlank(message = "student last name cannot be blank")
    @Column(nullable = false)
    private String lastName;

    @Column(nullable = true)
    private float cgpa;

//    @Column(nullable = false)
//    @NotNull(message = "enrollment date is required")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate enrollmentDate;

//    @Column(nullable = false)
//    @NotNull(message = "enrollment date is required")
    private String isInternational;

    public Student() {
    }

    public Student(Long studentId, String studentNumber, String firstName, String middleName, String lastName, float cgpa, LocalDate enrollmentDate, String isInternational) {
        this.studentId = studentId;
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.cgpa = cgpa;
        this.enrollmentDate = enrollmentDate;
        this.isInternational = isInternational;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public String getIsInternational() {
        return isInternational;
    }

    public void setIsInternational(String isInternational) {
        this.isInternational = isInternational;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Student.class.getSimpleName() + "[", "]")
                .add("studentId=" + studentId)
                .add("studentNumber='" + studentNumber + "'")
                .add("firstName='" + firstName + "'")
                .add("middleName='" + middleName + "'")
                .add("lastName='" + lastName + "'")
                .add("cgpa=" + cgpa)
                .add("enrollmentDate=" + enrollmentDate)
                .add("isInternational='" + isInternational + "'")
                .toString();
    }
}
