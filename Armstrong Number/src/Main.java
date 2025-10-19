import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Armstrong Number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int number = sc.nextInt();
        if(isArmsTrong(number)){
            System.out.println(number + " is an Armstrong number");
        }else{
            System.out.println(number + " is NOT an Armstrong number");
        }

        sc.close();

    }

    public static boolean isArmsTrong(int num){
        // step1 :  Count number of digits (n)
        int originalNumber = num;
        int digitCount = countDigits(num);

        // step 2 Calculate sum of powered digits
        int sum = 0;
        while (num > 0){
            int digit = num % 10; // Extract the Number
            sum += Math.pow(digit, digitCount);
            num = num / 10; // Cut the last number
        }
        // Step 3: compare with original number


        return sum == originalNumber;
    }

    public static int countDigits(int num){
        int count = 0;
        while (num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }
}