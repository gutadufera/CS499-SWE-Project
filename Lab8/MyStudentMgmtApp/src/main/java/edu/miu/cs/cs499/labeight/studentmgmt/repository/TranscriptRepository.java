package edu.miu.cs.cs499.labeight.studentmgmt.repository;

import edu.miu.cs.cs499.labeight.studentmgmt.model.Transcript;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TranscriptRepository extends CrudRepository<Transcript,Long> {
//    List<Transcript> findTranscriptsByDegreeTitle(String degreeTitle);
}
