package edu.miu.cs.cs499.labeight.studentmgmt.service.impl;

import edu.miu.cs.cs499.labeight.studentmgmt.model.Transcript;
import edu.miu.cs.cs499.labeight.studentmgmt.repository.TranscriptRepository;
import edu.miu.cs.cs499.labeight.studentmgmt.service.TranscriptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TranscriptServiceImpl implements TranscriptService {
    @Autowired
    private TranscriptRepository transcriptRepository;

    @Override
    public void save(Transcript transcript) {
        transcriptRepository.save(transcript);
    }

    @Override
    public List<Transcript> getAllTranscripts() {
        return (List<Transcript>)transcriptRepository.findAll();
    }

    @Override
    public void removeTranscript(Transcript transcript) {
        transcriptRepository.delete(transcript);
    }

    @Override
    public void removeById(Long id) {
        transcriptRepository.deleteById(id);
    }
}
