package edu.miu.cs.cs499.labeight.studentmgmt.service;

import edu.miu.cs.cs499.labeight.studentmgmt.model.Classroom;
import edu.miu.cs.cs499.labeight.studentmgmt.model.Transcript;

import java.util.List;

public interface ClassroomService {
    Classroom save(Classroom cr);
    Classroom getClassroomById(long id);
}
