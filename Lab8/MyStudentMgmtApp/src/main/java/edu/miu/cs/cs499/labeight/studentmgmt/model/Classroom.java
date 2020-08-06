package edu.miu.cs.cs499.labeight.studentmgmt.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
@Entity
@Table(name = "Classroos")
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "classroom_id")
    private Long classroomId;

    @Column(name = "building_name", nullable = false)
    private String buildingName;

    @Column(name = "room_number", nullable = false)
    private String roomNumber;

    @OneToMany(mappedBy = "classroom", cascade = CascadeType.ALL)
    private List<Student> students = new ArrayList<>();

    public Classroom() {
    }

    public Classroom(Long classroomId, String buildingName, String roomNumber, List<Student>students) {
        this.classroomId = classroomId;
        this.buildingName = buildingName;
        this.roomNumber = roomNumber;
        this.students = students;
    }
    public Classroom(String buildingName, String roomNumber, List<Student>students) {
        this.buildingName = buildingName;
        this.roomNumber = roomNumber;
        this.students = students;
    }

    public Classroom(String buildingName, String roomNumber) {
        this.buildingName = buildingName;
        this.roomNumber = roomNumber;
    }

    public Long getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(Long classroomId) {
        this.classroomId = classroomId;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public List<Student> getStudentList() {
        return students;
    }

    public void setStudentList(List<Student> studentList) {
        this.students = studentList;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Classroom.class.getSimpleName() + "[", "]")
                .add("classroomId=" + classroomId)
                .add("buildingName='" + buildingName + "'")
                .add("roomNumber='" + roomNumber + "'")
                .toString();
    }
}
