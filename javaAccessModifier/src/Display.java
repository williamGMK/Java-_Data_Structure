public interface Display {
    // public method accessible anywhere
    public void showPublic();


    // Default method Accessible to any class that implements the interface
    default void showDefault(){
        System.out.println(" Method in the private interface.");
    }
}


