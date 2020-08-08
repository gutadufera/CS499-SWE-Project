package edu.miu.cs.cs499.labnine.eregistrar.repository;

import edu.miu.cs.cs499.labnine.eregistrar.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

}
