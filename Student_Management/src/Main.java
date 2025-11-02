//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();
        FullTimeEmployee emp1 = new FullTimeEmployee("Glodi", 56323, 56300);
        FullTimeEmployee emp2 = new FullTimeEmployee("Cecile", 56324, 45300);

        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);
        System.out.println("Initial Employee Details:");
        payrollSystem.displayEmployee();

        System.out.println("Initial Employee Details:");
        payrollSystem.removeEmployee(56324);

        System.out.println("Initial Employee Details:");
        payrollSystem.displayEmployee();


    }
}