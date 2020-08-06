package edu.miu.cs.cs499.labeight.studentmgmt.repository;

import edu.miu.cs.cs499.labeight.studentmgmt.model.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

        List<Student> findStudentsByFirstName(String firstName);
}
