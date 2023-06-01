package dataType;

import commands.LibraryCommand;

import java.util.List;

// User class represents a library user who can borrow books
public class User {

    private String _name;
    private List<Book> _books;


    /**
     * Generates an instance of the User
     * @param name
     */
    public User(String name) {
        _name = name;
    }

    /**
     * Allows the User to borrow the Book
     * @param borrowBook
     * @return Boolean indicating failure or success
     */
    public boolean borrowBook(Book borrowBook) {

        if(borrowBook.getAvail()){
            _books.add(borrowBook);
            return true;
        }
        return false;

    }
}