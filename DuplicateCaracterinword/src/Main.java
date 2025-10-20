import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        findDuplicatesWithHashMap(input);

        scanner.close();
    }

    public static void findDuplicatesWithHashMap(String str){
        if(str == null || str.length() <= 1){
            System.out.println("No duplicates found");
            return;
        }


        // Step 1: Create frequency map
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Step 2: Count character frequencies
        for (char c : str.toCharArray()){
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        //Step 3: Find and display duplicates
        System.out.println("Duplicate characters in '" + str + "':");
        boolean foundDuplicates = false;

        for(Map.Entry<Character, Integer> entry : charCount.entrySet()){
            if (entry.getValue() > 1) {
                System.out.println("'" + entry.getKey() + "' : " + entry.getValue() + " times");
                foundDuplicates = true;
            }
            if (!foundDuplicates) {
                System.out.println("No duplicate characters found");
            }
        }
    }
}