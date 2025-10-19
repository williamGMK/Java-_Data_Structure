import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter a number1:");
        numbers[0] = scanner.nextInt();
        System.out.println("Enter a number2:");
        numbers[1] = scanner.nextInt();
        System.out.println("Enter a number3:");
        numbers[2] = scanner.nextInt();
        System.out.println("Enter a number4:");
        numbers[3] = scanner.nextInt();
        System.out.println("Enter a number5:");
        numbers[4] = scanner.nextInt();

        for (int i = 0; i<numbers.length; i++){
            System.out.println("Enter a number1:" + i+ ":"+ numbers[i]);
        }
    }


}