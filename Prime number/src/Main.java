import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("the a number");
        int num = scanner.nextInt();
        if(isPrime(num)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }

    public static boolean isPrime(int num){
       for(int i = 2; i <= num / 2; i++ ){
           if(num % i == 0){
               return false;
           }
       }
        return true;
    }
}