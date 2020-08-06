package edu.miu.cs.cs499.labeight.studentmgmt;
import edu.miu.cs.cs499.labeight.studentmgmt.model.Classroom;
import edu.miu.cs.cs499.labeight.studentmgmt.model.Student;
import edu.miu.cs.cs499.labeight.studentmgmt.model.Transcript;
import edu.miu.cs.cs499.labeight.studentmgmt.service.ClassroomService;
import edu.miu.cs.cs499.labeight.studentmgmt.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class StudentmgmtApplication implements CommandLineRunner {

    @Autowired
    private StudentService studentService;
    @Autowired
    private ClassroomService classroomService;

    public static void main(String[] args) {
        SpringApplication.run(StudentmgmtApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
          Student s1 = new Student("000-61-011", "Ana",
                  "Lynn", "Smith", 3.45f,
                  LocalDate.of(2019, 5, 29));
        Student s2 = new Student("000-61-032", "Trump",
                "Tom", "Mikael", 3.7f,
                LocalDate.of(2019, 5, 25));
        Transcript t1 = new Transcript("Bs Computer Science");
        Transcript t2 = new Transcript("Biology");
        s1.setTranscript(t1);
        s2.setTranscript(t2);
        Student saveS1 = saveStudent(s1);
        Student saveS2 = saveStudent(s2);

        List<Student>sts = new ArrayList<>();
        sts.add(s1);
        sts.add(s2);
        //System.out.println(saveS1);
        //create classroom
        Classroom cr1 = new Classroom("McLaughlin building", "M105");
        Classroom cr2 = new Classroom("Verrill Hall", "V29");
        Classroom cr3 = new Classroom("Dreier Building", "#3");
        Classroom cr4 = new Classroom("White House", "G4");
        Classroom savedcr1 = classroomService.save(cr1);
        Classroom savedcr2 = classroomService.save(cr2);
        Classroom savedcr3 = classroomService.save(cr3);
        Classroom savedcr4 = classroomService.save(cr4);
        System.out.println(savedcr1);

        saveS1.setClassroom(savedcr1);
        saveS2.setClassroom(savedcr2);
        studentService.saveStudent(saveS1);
        studentService.saveStudent(saveS2);
        List<Student> students = getAllStudents();

        //print students
        students.forEach(System.out::println);
    }
    private Student saveStudent(Student newStudent){
        return studentService.saveStudent(newStudent);
    }
    private List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
    //private Student updateStudent(Student)

}
