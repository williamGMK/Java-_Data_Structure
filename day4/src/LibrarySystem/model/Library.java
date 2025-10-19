package LibrarySystem.model;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;


    public Library(){
        books = new ArrayList<>();
        books.add(new Book("1568","George Orwell"));
        books.add(new Book("To Kill a Mockingbird","Harper Lee"));
    }

    public void addBook(Book book){
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public Book findBookByTitle(String title){
        for(Book book: books){
            if(book.title.equalsIgnoreCase(title)){
                return book;
            }
        }
        return null;
    }
}
