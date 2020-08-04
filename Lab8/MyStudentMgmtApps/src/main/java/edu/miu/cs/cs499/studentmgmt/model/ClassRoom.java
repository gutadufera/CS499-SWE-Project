package edu.miu.cs.cs499.studentmgmt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ClassRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "class_room_id")
    private long classroomid;

    private String buildingName;
    private String roomNumber;

    @OneToOne(mappedBy = "classRoom")
    private Student student;

    public ClassRoom() {

    }

    public long getClassroomid() {
        return classroomid;
    }

    public void setClassroomid(long classroomid) {
        this.classroomid = classroomid;
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

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "ClassRoom [classroomid=" + classroomid + ", buildingName=" + buildingName + ", roomNumber=" + roomNumber
                + ", student=" + student + "]";
    }

}
