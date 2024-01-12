package dasturlash.uz;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "student_course")
public class StudentCourseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "student_id")
    private EmployeeEntity student;
    @ManyToOne
    @JoinColumn(name = "course_id")
    private DepartmentEntity course;

    @Column(name = "start_date")
    private LocalDate startDate; // course start date
    @Column(name = "finish_date")
    private LocalDate finishedDate; // course finished date
    @Column(name = "score")
    private Integer score; // course score

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public EmployeeEntity getStudent() {
        return student;
    }

    public void setStudent(EmployeeEntity student) {
        this.student = student;
    }

    public DepartmentEntity getCourse() {
        return course;
    }

    public void setCourse(DepartmentEntity course) {
        this.course = course;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getFinishedDate() {
        return finishedDate;
    }

    public void setFinishedDate(LocalDate finishedDate) {
        this.finishedDate = finishedDate;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
