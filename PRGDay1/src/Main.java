//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Please Enter your Name");

        String name = scanner.nextLine();
        System.out.printf("Please Enter your SurName");
        String surname = scanner.nextLine();

        System.out.printf("Please Enter your Age");
        String age = scanner.nextLine();


        System.out.println("Your fullname is:");

        System.out.println(name+" " +surname+" " + age );

    }
}