import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AtmOperations operation = new AtmOperationImpl();
       int atmNumber = 50505;
       int atmPin = 1999;

        Scanner in  = new Scanner(System.in);
        System.out.println("=====------------------:Welcome to ATM Machine !!!:-------------------===========================");
        System.out.println("===================Enter the ATM number:===========================");
        int atmNumbers = in.nextInt();
        System.out.println("===================Enter the Pin:===========================");
        int pin = in.nextInt();

        // the system check the correctness of the identifies
        if((atmNumber == atmNumbers) && (atmPin == pin)){
            while(true){
                System.out.println("1.View Available Balance\n 2.Withdraw Amount\n 3.Deposit Amount\n 4.View Ministatement\n 5.Exit\n");
                System.out.println("Enter Choice :");
                int choice  = in.nextInt();
                if(choice == 1){
                    operation.viewBalance();

                } else if (choice == 2){
                    System.out.println("Enter The Amount to withdraw :");
                    double withdraAmount = in.nextDouble();
                    operation.withdrawAmount(withdraAmount);

                } else if (choice == 3){
                    System.out.println("Enter The Amount to deposit:");
                    double depositAmount = in.nextDouble();
                    operation.depositAmount(depositAmount);

                } else if (choice == 4){
                    operation.viewMiniStatement();

                } else if (choice == 5){
                    System.out.println("Collect your ATM Card\n Thank you for using ATM Machine !! ");
                    System.exit(0);
                } else {
                    System.out.println("Please Choice Invalide\n try Again");
                }
            }
        } else {
            System.out.println("incorrect Atm Number or Pin");
            System.exit(0);
        }
    }
}