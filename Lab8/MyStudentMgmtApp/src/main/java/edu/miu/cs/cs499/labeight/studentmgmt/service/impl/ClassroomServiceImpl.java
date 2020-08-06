package edu.miu.cs.cs499.labeight.studentmgmt.service.impl;

import edu.miu.cs.cs499.labeight.studentmgmt.model.Classroom;
import edu.miu.cs.cs499.labeight.studentmgmt.repository.ClassroomRepository;
import edu.miu.cs.cs499.labeight.studentmgmt.service.ClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassroomServiceImpl implements ClassroomService {

    @Autowired
    private ClassroomRepository classroomRepository;


    @Override
    public Classroom save(Classroom cr) {
        return classroomRepository.save(cr);
    }

    @Override
    public Classroom getClassroomById(long id) {
        return null;
    }
}
