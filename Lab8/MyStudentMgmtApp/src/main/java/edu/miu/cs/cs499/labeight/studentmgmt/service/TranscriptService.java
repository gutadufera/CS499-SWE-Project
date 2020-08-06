package edu.miu.cs.cs499.labeight.studentmgmt.service;

import edu.miu.cs.cs499.labeight.studentmgmt.model.Transcript;
import edu.miu.cs.cs499.labeight.studentmgmt.repository.TranscriptRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface TranscriptService {
    void save(Transcript transcript);
    List<Transcript> getAllTranscripts();
    void removeTranscript(Transcript transcript);
    void removeById(Long id);
}
