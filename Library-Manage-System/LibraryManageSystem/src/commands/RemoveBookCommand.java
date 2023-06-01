package commands;

import dataType.Book;
import dataType.Library;

// RemoveBookCommand removes a book from the library
public class RemoveBookCommand implements LibraryCommand {
    private Library library;
    private Book book;

    public RemoveBookCommand(Library library, Book book) {
        this.library = library;
        this.book = book;
    }

    public void execute() {
        library.removeBook(book);
    }
}