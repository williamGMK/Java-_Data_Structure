import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int value, reverse = 0 , r, a;
        System.out.println("Write Your number Right here");
        Scanner sc = new Scanner(System.in);
        value = sc.nextInt();

        a = value;
        while(value > 0){
            r = value % 10; // Extract last digit using number % 10
            reverse = reverse * 10 + r; // Build reversed number using reversed = reversed * 10 + lastDigit
            value = value / 10; //Remove last digit using

        }
        System.out.println("Reverse: " +reverse);
    }
}