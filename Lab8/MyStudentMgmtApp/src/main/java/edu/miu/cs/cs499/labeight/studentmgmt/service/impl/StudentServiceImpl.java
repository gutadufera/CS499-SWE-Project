package edu.miu.cs.cs499.labeight.studentmgmt.service.impl;

import edu.miu.cs.cs499.labeight.studentmgmt.model.Student;
import edu.miu.cs.cs499.labeight.studentmgmt.repository.StudentRepository;
import edu.miu.cs.cs499.labeight.studentmgmt.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * studentRepository.save(newstudent);
 *         studentRepository.delete(newstudent);
 *         studentRepository.deleteById(2l);
 *         studentRepository.deleteAll();
 *         studentRepository.count();
 *         studentRepository.
 */
@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }

    @Override
    public Student saveStudent(Student newstudent) {
        return studentRepository.save(newstudent);
    }

    @Override
    public List<Student> getAllStudents() {
        return (List<Student>) studentRepository.findAll();
    }

}
