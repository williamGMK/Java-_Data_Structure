//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Create an instance of AccessModifiers
        AccessModifiers obj = new AccessModifiers();

        //Access public method
        obj.showPublic();

        // Access default method from the interface
        obj.showDefault();

        // Demonstrate access to private, protected , and package-private methods
        obj.demonstrateAccess();
    }
}