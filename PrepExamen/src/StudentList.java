import java.util.ArrayList;
import java.util.List;

public class StudentList {
    static ArrayList<Student> students = new ArrayList<>();

    public void Initialize(){
        students.add(new DegreeStudent("20180","Lius", "Paper","Degree"));
        students.add(new DegreeStudent("20181","Anna","Smith","Degree"));
        students.add(new DegreeStudent("20182","John", "Paper","Diploma"));
        students.add(new DegreeStudent("20183","Jane","Smith","Degree"));
        students.add(new DegreeStudent("20184","Mark", "Paper","Diploma"));
        students.add(new DegreeStudent("20185","Glodi","mukomo","Diploma"));

    }

    public static void addStudent(Student student){
        students.add(student);
    }

    public static List<Student> getStudents(){
        return students;
    }
}
