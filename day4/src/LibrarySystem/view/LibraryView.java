package LibrarySystem.view;

import LibrarySystem.model.Book;

import java.util.Scanner;

public class LibraryView {
    private Scanner scanner;

    public LibraryView(){
        scanner = new Scanner(System.in);

    }

    public void displayBookDetails(Book book){
        System.out.println(book);
    }

    public void displayAllBooks(Iterable<Book> books){
        for (Book book: books){
            System.out.println(book);
        }
    }

    public void displayBookNotFound(String title){
        System.out.println("Book titled" + title+ "not found");
    }

    public Book promptNewBook(){
        System.out.println("Enter book title:");
        String title = scanner.nextLine();
        System.out.println("Enter book author:");
        String author = scanner.nextLine();
        return new Book(title, author);
    }
}
