package edu.miu.cs.cs499.labeight.studentmgmt.service;

import edu.miu.cs.cs499.labeight.studentmgmt.model.Student;

import java.util.List;

public interface StudentService {
    public abstract Student saveStudent(Student newstudent);
    List<Student> getAllStudents();
}
