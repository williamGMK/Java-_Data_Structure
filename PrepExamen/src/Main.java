import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();

        // Displaying all students
        studentList.Initialize();
        System.out.println("Display all students:");

        for (Student student : StudentList.getStudents()){
            System.out.println(student);
        }

        System.out.println("-----------------------------------------");
        System.out.println("How many Students do you want To Add ?:");

        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < numberOfStudents; i++){
            AddStudent add = new AddStudent();
            add.promptAndAddStudent();

        }

        System.out.println("-----------------------------------------");
        for (Student student : studentList.getStudents()){
            student.study();
        }
    }
}