package LibrarySystem.controller;

import LibrarySystem.model.Book;
import LibrarySystem.model.Library;
import LibrarySystem.view.LibraryView;

public class LibraryController {
    private Library library;
    private LibraryView view;

    public LibraryController(Library library, LibraryView view) {
        this.library = library;
        this.view = view;
    }

    public void addBook(){
        Book book = view.promptNewBook();
        library.addBook(book);
        System.out.println("Book added successfully!");
    }

    public void displayAllBooks(){
        view.displayAllBooks(library.getBooks());
    }

    public void findBookByTitle(String title){
        Book book = library.findBookByTitle(title);
        if(book != null){
            view.displayBookDetails(book);
        }else{
            view.displayBookNotFound(title);
        }
    }
}
