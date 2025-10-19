import java.util.ArrayList;
import java.util.Scanner;

public class AddStudent {
    // AddStudent class to prompt user for student details and add a new student to thed list
    ArrayList<Student> students = new ArrayList<>();
    StudentList studentList = new StudentList();
    Scanner scanner = new Scanner(System.in);

    public void promptAndAndStudent(){
        System.out.print("Enter student number:");
        String studentNumber = scanner.nextLine();

        System.out.print("Enter student number:");
        String name = scanner.nextLine();

        System.out.print("Enter student number:");
        String surname = scanner.nextLine();

        System.out.print("Enter course (Degree/Diploma):");
        String course = scanner.nextLine();

       if(course.equalsIgnoreCase("Degree")){
           StudentList.addStudent(new DegreeStudents(studentNumber, name, surname, course));
       }else if (course.equalsIgnoreCase("Diploma")){
           StudentList.addStudent(new Diploma(studentNumber,name, surname, course));
       } else{
           System.out.println("Inval course type. Student not added.");
       }
    }
}
