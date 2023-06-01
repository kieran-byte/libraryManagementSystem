package testing;

import commands.LibraryCommand;
import dataType.Book;
import dataType.Library;
import dataType.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import commands.*;

public class CommandsTest {
    private Library library;
    private Book book1;
    private Book book2;
    private User user;

    @BeforeEach
    void setUp() {
        library = new Library();
        book1 = new Book( "The Great Gatsby", "F. Scott Fitzgerald", "12/6/2023");
        book2 = new Book( "To Kill a Mockingbird", "Harper Lee" , "12/6/2023");
        library.addBook(book1);
        library.addBook(book2);
        user = new User("John Doe");
    }

    @Test
    void testAddBookCommand() {
        int initialSize = library.getAllBooks().size();
        Book bookToAdd = new Book("Pride and Prejudice", "Jane Austen" , "12/6/2023");
        LibraryCommand addBookCommand = new AddBookCommand(library, bookToAdd);
        addBookCommand.execute();
        Assertions.assertEquals(initialSize + 1, library.getAllBooks().size());
    }

    @Test
    void testRemoveBookCommand() {
        int initialSize = library.getAllBooks().size();
        LibraryCommand removeBookCommand = new RemoveBookCommand(library, book1);
        removeBookCommand.execute();
        Assertions.assertEquals(initialSize - 1, library.getAllBooks().size());
    }
}
