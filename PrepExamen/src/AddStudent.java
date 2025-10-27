import java.util.ArrayList;
import java.util.Scanner;

public class AddStudent {
    ArrayList<Student> students = new ArrayList<>();
    StudentList studentList = new StudentList();

    Scanner scanner = new Scanner(System.in);

    public void promptAndAddStudent(){
        System.out.print("Enter student number:");
        String studentNumber = scanner.nextLine();

        System.out.print("Enter name:");
        String name  = scanner.nextLine();

        System.out.print("Enter surname:");
        String surname  = scanner.nextLine();

        System.out.print("Enter course (Degree/Diploma):");
        String course  = scanner.nextLine();

        if(course.equalsIgnoreCase("Degree")){
            StudentList.addStudent(new DegreeStudent(studentNumber, name, surname, course));
        }else if (course.equalsIgnoreCase("Diploma")){
            StudentList.addStudent(new DegreeStudent(studentNumber, name, surname, course));
        }else {
            System.out.println("Invalid course type. Student not added.");
        }


    }
}
