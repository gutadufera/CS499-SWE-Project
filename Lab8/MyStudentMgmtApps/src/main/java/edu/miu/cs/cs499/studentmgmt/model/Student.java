package edu.miu.cs.cs499.studentmgmt.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long studentId;

    @NotEmpty(message = "please enter student number")
    private String studentNumber;

    @NotEmpty(message = "Please enter first Name")
    private String firstName;

    private String middleName;

    @NotEmpty(message = "Please enter last name")
    private String lastName;

    private double cgpa;

    private LocalDate dateOfEnrollment;

    @OneToOne
    @JoinColumn(name = "class_room_id")
    private ClassRoom classRoom;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Transcript> transcript = new ArrayList<Transcript>();

    public Student() {
    }

    public Student(String studentNumber, String firstName, String middleName, String lastName, double cgpa,
                   LocalDate dateOfEnrollment) {
        super();
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.cgpa = cgpa;
        this.dateOfEnrollment = dateOfEnrollment;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
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

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public LocalDate getDateOfEnrollment() {
        return dateOfEnrollment;
    }

    public void setDateOfEnrollment(LocalDate dateOfEnrollment) {
        this.dateOfEnrollment = dateOfEnrollment;
    }

    public List<Transcript> getTranscript() {
        return transcript;
    }

    public void setTranscript(List<Transcript> transcript) {
        this.transcript = transcript;
    }

    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", studentNumber=" + studentNumber + ", firstName=" + firstName
                + ", middleName=" + middleName + ", lastName=" + lastName + ", cgpa=" + cgpa + ", dateOfEnrollment="
                + dateOfEnrollment + ", classRoom=" + classRoom + ", transcript=" + transcript + "]";
    }

}
