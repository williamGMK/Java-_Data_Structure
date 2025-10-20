import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = reverseEachWord(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed words: " + result);

        scanner.close();
    }

    public static String reverseEachWord(String str){
        //step 1 ;  Split into words
        String[] words = str.split(" "); // its splitting when sees and space

        // Step 2 : Reverse each word
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < words.length; i++){
            String reversedWord = new StringBuilder(words[i]).reverse().toString();
            result.append(reversedWord);

            // Add space between words (but not after last words)
            if(i < words.length -1){
                result.append(" ");
            }
        }
        return result.toString();
    }
}
