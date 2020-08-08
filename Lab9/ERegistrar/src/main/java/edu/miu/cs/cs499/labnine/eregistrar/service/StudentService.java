package edu.miu.cs.cs499.labnine.eregistrar.service;

import edu.miu.cs.cs499.labnine.eregistrar.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);
    Student getStudentById(Long studentId);
    void deleteStudentByID(Long studentId);
    List<Student> searchStudents(String string);
}
