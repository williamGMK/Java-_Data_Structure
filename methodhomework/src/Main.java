import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your first Number:");
        int number1 = scanner.nextInt();
        System.out.print("Enter Your Second Number:");
        int number2 = scanner.nextInt();
        // this ask for the choice Operation to be performed
        System.out.print("Enter Your choice Number:");
        int expression = scanner.nextInt();

        switch (expression){
            case 1:
                int result = Addition(number1, number2);
                System.out.println("Here the result of the addition:" + result);
                break;
            case 2:
                int result1 = Subtraction(number1, number2);
                System.out.println("Here the result of the Subtraction:" + result1);
                break;
            case 3:
                int result2 = Multiplication(number1, number2);
                System.out.println("Here the result of the Multiplication:" + result2);
                break;
            case 4:
                int result3 = Division(number1, number2);
                System.out.println("Here the result of the Division:" + result3);
                break;

        }


    }

    static int Addition(int number1, int number2){
        return number1 + number2;
    }
    static int Subtraction(int number1, int number2){
        return number1 - number2;
    }

    static int Multiplication(int number1, int number2){
        return number1 * number2;
    }

    static int Division(int number1, int number2){
        return number1 / number2;
    }

    enum Operation{
        Addition,
        Soustraction,
        Multiplication,
        Divisin
    }
};