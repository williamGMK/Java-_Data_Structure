import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int facto = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("type your number here");
        int FactorialNumber = sc.nextInt();

        for(int i = 1; i<=FactorialNumber; i++ ){

            facto = facto * i;

        }
        System.out.println("type your number here:"+ facto);

    }
}