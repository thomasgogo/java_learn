import java.util.ArrayList;
import java.util.List;

public class NewStudentManager {
    private List<NewStudent> students;

    public NewStudentManager() {
        students = new ArrayList<>();
    }

    public void addStudents(NewStudent newStudent) {
        students.add(newStudent);
    }

    public void removeStudent(NewStudent newStudent) {
        students.remove(newStudent);
    }

    public void printStudents() {
        for(NewStudent newStudent: students) {
            System.out.println(newStudent.getName());
        }
    }
}
