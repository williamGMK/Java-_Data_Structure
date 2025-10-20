import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your number here");
        int number = sc.nextInt();
        if(isPalindrome(number)){
            System.out.println("True: this  a palindrome");
        }else{
            System.out.println("False: this not a palindrome");
        }

        sc.close();
    }

    public static boolean isPalindrome(int num){
        // Step 1: Handle negative numbers and single digit
        if(num < 0) return false;
        if(num >= 0 && num <=9) return false;

        // step 2 rervese the Number
        int originalNumber = num;
        int reverseNumber = 0;

        while(num > 0){
            int digit = num % 10;
            reverseNumber = reverseNumber * 10 + digit;
            num = num / 10;
        }
        //step 3 : compare the Deux Number
        return originalNumber == reverseNumber ;
    }
}