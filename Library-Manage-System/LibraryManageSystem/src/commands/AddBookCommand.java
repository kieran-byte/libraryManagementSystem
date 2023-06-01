package commands;

import dataType.Book;
import dataType.Library;

// AddBookCommand adds a book to the library
public class AddBookCommand implements LibraryCommand {
    private Library library;
    private Book book;

    public AddBookCommand(Library library, Book book) {
        this.library = library;
        this.book = book;
    }

    public void execute() {
        library.addBook(book);
    }
}
