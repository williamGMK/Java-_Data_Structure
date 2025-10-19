import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre First Number");
        int num1 = sc.nextInt();
        System.out.println("Entre Second Number");
        int num2 = sc.nextInt();

        System.out.println("Numbers Before Swap"+ num1 +"==="+ num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After swapping: num1= "+num1+ " num2 ="+ num2);

    }
}