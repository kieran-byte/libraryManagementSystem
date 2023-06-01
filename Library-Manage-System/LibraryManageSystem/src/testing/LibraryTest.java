package testing;

import dataType.Library;
import dataType.Book;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class LibraryTest {
    private Library library;

    @BeforeEach
    void setUp() {
        library = new Library();
        library.addBook(new Book( "The Great Gatsby", "F. Scott Fitzgerald", "12/6/2023"));
        library.addBook(new Book( "To Kill a Mockingbird", "Harper Lee" , "12/6/2023"));
        library.addBook(new Book( "Pride and Prejudice", "Jane Austen", "12/6/2023"));
        library.addBook(new Book( "1984", "George Orwell", "12/6/2023"));
    }

    @Test
    void testAddBook() {
        int initialSize = library.getAllBooks().size();
        library.addBook(new Book("Misadventures and how to have them", "The Catcher in the Rye", "12/6/2080"));
        Assertions.assertEquals(initialSize + 1, library.getAllBooks().size());
    }

    @Test
    void testRemoveBook() {
        int initialSize = library.getAllBooks().size();
        Book bookToRemove = library.getAllBooks().get(0);
        library.removeBook(bookToRemove);
        Assertions.assertEquals(initialSize - 1, library.getAllBooks().size());
    }

    @Test
    void testSearchByTitle() {
        List<Book> foundBooks = library.searchByTitle("pride and prejudice");
        Assertions.assertEquals(1, foundBooks.size());
        Assertions.assertEquals("Pride and Prejudice", foundBooks.get(0).getBookName());
    }
}
