import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();

        //Display all students
        studentList.Initialize();
        System.out.println("Display all students:");
        for (Student student: studentList.getStudents()){
            System.out.println(student);
        }

        System.out.println("================================STUDENTS===============================");
        // Asking for many students to add
        System.out.println("How many students do you want to add?");
        Scanner scanner = new Scanner(System.in);
        int numbersOfStudents = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < numbersOfStudents; i++){
            AddStudent add = new AddStudent();
            add.promptAndAndStudent();
        }

        System.out.println("================================STUDENTS===============================");
        //Demonstrating polymorphism
        for(Student student: studentList.getStudents()){
            student.study();
        }
    }
}