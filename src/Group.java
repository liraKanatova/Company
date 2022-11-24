import java.time.LocalDate;
import java.util.Arrays;

public class Group {

    private String Groupname;
    private Student[] students;
    private LocalDate dateOfStart;
    private LocalDate dateOfFinish;

    public Group(String groupname, Student[] students, LocalDate dateOfStart, LocalDate dateOfFinish) {
        Groupname = groupname;
        this.students = students;
        this.dateOfStart = dateOfStart;
        this.dateOfFinish = dateOfFinish;
    }

    public String getGroupname() {
        return Groupname;
    }

    public void setGroupname(String groupname) {
        Groupname = groupname;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public LocalDate getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(LocalDate dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public LocalDate getDateOfFinish() {
        return dateOfFinish;
    }

    public void setDateOfFinish(LocalDate dateOfFinish) {
        this.dateOfFinish = dateOfFinish;
    }

    @Override
    public String toString() {
        return "Group{" +
                "Groupname='" + Groupname + '\'' +
                ", students=" + Arrays.toString(students) +
                ", dateOfStart=" + dateOfStart +
                ", dateOfFinish=" + dateOfFinish +
                '}';
    }
}

