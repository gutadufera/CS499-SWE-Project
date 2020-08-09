package edu.miu.cs.cs499.labnine.eregistrar.service.impl;

import edu.miu.cs.cs499.labnine.eregistrar.model.Student;
import edu.miu.cs.cs499.labnine.eregistrar.repository.StudentRepository;
import edu.miu.cs.cs499.labnine.eregistrar.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }
    @Override
    public List<Student> getAllStudents() {
        return (List<Student>) studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long studentId) {
        return studentRepository.findById(studentId).orElse(null);
    }

    @Override
    public void deleteStudentByID(Long studentId) {
        studentRepository.deleteById(studentId);
    }

    @Override
    public List<Student> searchStudents(String string) {
        if(string instanceof String){
            string = string.toLowerCase();
        }
        return studentRepository.findAllByStudentNumberContainingOrFirstNameContainingOrMiddleNameContainingOrLastNameContaining(
                string, string, string, string);
    }
}
