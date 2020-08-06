package edu.miu.cs.cs499.labeight.studentmgmt.repository;

import edu.miu.cs.cs499.labeight.studentmgmt.model.Classroom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassroomRepository extends CrudRepository<Classroom, Long> {
}
