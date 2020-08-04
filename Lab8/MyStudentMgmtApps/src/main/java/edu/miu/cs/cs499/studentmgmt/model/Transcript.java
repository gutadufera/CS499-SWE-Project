package edu.miu.cs.cs499.studentmgmt.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Transcript {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long transcriptId;

    private String degreeTitle;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    public Transcript() {

    }

    public long getTranscriptId() {
        return transcriptId;
    }

    public void setTranscriptId(long transcriptId) {
        this.transcriptId = transcriptId;
    }

    public String getDegreeTitle() {
        return degreeTitle;
    }

    public void setDegreeTitle(String degreeTitle) {
        this.degreeTitle = degreeTitle;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Transcript [transcriptId=" + transcriptId + ", degreeTitle=" + degreeTitle + ", student=" + student
                + "]";
    }
}
