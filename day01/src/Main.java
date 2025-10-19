import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[][] numbers = {{1,2,3,4},{5,6,7}};
        for(int i=0; i< numbers.length; i++){
            for(int j=0; j< numbers[i].length; j++){
                System.out.println(numbers[i][j]);
            }
        }

    }
}