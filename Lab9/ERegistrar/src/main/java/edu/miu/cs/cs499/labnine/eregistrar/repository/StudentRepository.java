package edu.miu.cs.cs499.labnine.eregistrar.repository;

import edu.miu.cs.cs499.labnine.eregistrar.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
    List<Student> findAllByStudentNumberContainingOrFirstNameContainingOrMiddleNameContainingOrLastNameContaining(
            String studentNumber,String firstName, String middleName, String lastName);

}
