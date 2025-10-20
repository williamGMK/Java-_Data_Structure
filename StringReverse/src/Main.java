import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word");
        String input = scanner.nextLine();

        String reversed = reverseWithStringBuilder(input);
        System.out.println("Original: "+input);
        System.out.println("Reversed: "+reversed);

    }

    public static String reverseWithStringBuilder(String str){
        return new StringBuilder(str).reverse().toString();
    }
}