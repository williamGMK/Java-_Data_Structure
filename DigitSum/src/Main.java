import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write Your Number");
        int number = sc.nextInt();

        int sumOfDigits  = calculateSumOfDigits(number);
        System.out.println("The Sum is :"+ sumOfDigits);


    }

    public static int calculateSumOfDigits(int num){
        int sum = 0;
        while(num > 0){
            int digit = num %10; // Extrat the Last Digit
            sum = sum + digit; // Add the digit to sum
            num = num / 10; // remove the last digit from the number
        }

        return sum;
    }
}