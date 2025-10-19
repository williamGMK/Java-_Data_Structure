import java.util.ArrayList;
import java.util.List;

public class StudentList {
    static ArrayList<Student> students = new ArrayList<>();

    public void Initialize(){
        students.add(new DegreeStudents("25653","Glodi","Mukomo","Degree"));
        students.add(new DegreeStudents("25653","Cecile","Mukomo","Degree"));
        students.add(new Diploma("25653","Milka","Mukomo","Degree"));
        students.add(new DegreeStudents("25653","Darrel","Mukomo","Degree"));
        students.add(new Diploma("25653","Barack","Mukomo","Degree"));
    }

    public static void addStudent(Student student){
        students.add(student);
    }

    public List<Student> getStudents(){
        return students;
    }
}
