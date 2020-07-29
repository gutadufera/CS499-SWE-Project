package edu.miu.cs.cs499.demos.studentrecordsmgmtapp;

import edu.miu.cs.cs499.demos.studentrecordsmgmtapp.model.Student;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MyStudentRecordsMgmtApp {
    public static void main(String[] args) {
        Student[] students = {new Student(110001, "Dave", LocalDate.of(1951,11,18)),
                new Student(110002, "Anna", LocalDate.of(1990,12,7)),
                new Student(110003, "Erica", LocalDate.of(1974,1,31)),
                new Student(110004, "Carlos", LocalDate.of(2009,8,22)),
                new Student(110005, "Bob", LocalDate.of(1990,3,5))};
        System.out.println("Printing the list of students in ascending order\n" +
                "=======================================================");
        printListOfStudents(students);
        //printListOfStudents2(students);
        System.out.println("Printing the list of platinum almni students in descending order\n" +
                "=======================================================");
        getListOfPlatinumAlumniStudents(students).forEach(System.out::println);
    }
    public static void printListOfStudents(Student[]students){
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (Student std: students) {
            System.out.println(std);
        }

    }
//    public static void printListOfStudents2(Student[]students){
//        Arrays.sort(students);
//        for (Student std: students) {
//            System.out.println(std);
//        }

//  /  }

    public static List<Student> getListOfPlatinumAlumniStudents(Student[]students){
        List<Student> platinumAlumni = new ArrayList<>();
        for (Student std: students) {
//            if(LocalDate.now().getYear()-std.getDateOfAdmission().getYear()>=30)
//                platinumAlumni.add(std);
            if(Period.between(std.getDateOfAdmission(),LocalDate.now()).getYears()>=30){
                platinumAlumni.add(std);
            }
        }
        platinumAlumni.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getDateOfAdmission().compareTo(o1.getDateOfAdmission());
            }
        });
        return platinumAlumni;

    }
}
