import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your number Here");
        int number = scanner.nextInt();

        if(number % 2 == 0){
            System.out.println("say Even");
        } else {
            System.out.println("say Odd");
        }
    }
}