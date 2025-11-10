public class AccessModifiers implements Display {
    // Public method implementation accessible anywhere
    public void showPublic() {
        System.out.println("This is a public method.");
    }

    // Protected method (accessible within the same package and subclasses)
    protected void showProtected() {
        System.out.println("This is a protected method.");
    }

    // Private method (accessible only within this class)
    private void showPrivate() {
        System.out.println("This is a private method.");
    }

    // default method (accessible within the same package)
    void showPackagePrivate() {
        System.out.println("This is a package-private method.");
    }


    public void demonstrateAccess(){
        // Accessible within the class
        showPrivate();

        // Accessible within the class
        showProtected();

        // Accessible within the class
        showPackagePrivate();
    }

}
