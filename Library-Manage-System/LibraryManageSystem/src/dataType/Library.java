package dataType;

import java.util.ArrayList;
import java.util.List;

// Library class manages the collection of books
public class Library {
    private List<Book> books;

    /**
     * Create instance of Library object
     *
     */
    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public List<Book> getAllBooks() {
        return books;
    }

    /**
     * Given a title, retrieves all books with the title
     * @param title
     * @return A list of Books
     */
    public List<Book> searchByTitle(String title) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getBookName().equalsIgnoreCase(title)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }
}
