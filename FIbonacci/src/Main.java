import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int number = scanner.nextInt();
        int first =0;
        int second = 1;
        int next;
        System.out.println("Fibobacci Series");
        for(int i =0; i <= number; i++){
            System.out.println(first + "");
            next = first + second;
            first = second;
            second = next;

        }

    }
}