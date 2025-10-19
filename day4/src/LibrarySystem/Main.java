package LibrarySystem;

import LibrarySystem.controller.LibraryController;
import LibrarySystem.model.Library;
import LibrarySystem.view.LibraryView;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        LibraryView view = new LibraryView();
        LibraryController controller = new LibraryController(library, view);


        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while(running){
            System.out.println("\nLibrary Management System");
            System.out.println("1. Display all books");
            System.out.println("2. Search for a book by title");
            System.out.println("3. Add a new book");
            System.out.println("4. Exit");
            System.out.println("enter your choice");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    controller.displayAllBooks();
                    break;
                case 2:
                    System.out.println("Enter book title to search:");
                    String title = scanner.nextLine();
                    controller.findBookByTitle(title);
                    break;
                case 3:
                    controller.addBook();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again");

            }
        };
    }


};