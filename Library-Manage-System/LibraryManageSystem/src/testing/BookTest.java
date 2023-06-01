package testing;

import dataType.Book;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {

    private Book obj;

    @BeforeEach
    public void setUp(){
        obj = new Book("A series of fortunate events", "Liam Thompton", "12/20/2021");
    }

    @org.junit.jupiter.api.Test
    void getBookName() {


        assertEquals(obj.getBookName(), "A series of fortunate events");
    }

    @org.junit.jupiter.api.Test
    void getBookAuthor() {
        assertEquals(obj.getBookAuthor(), "Liam Thompton");
    }

    @org.junit.jupiter.api.Test
    void getPubDate() {
        assertEquals(obj.getPubDate(), "12/20/2021");
    }

    @org.junit.jupiter.api.Test
    void getAvail() {
        assertEquals(obj.getAvail(), true);
    }

    @org.junit.jupiter.api.Test
    void printBook() {

        String outPut = obj.printBook();

        assertEquals(obj.printBook(), "The title of the book is: A series of fortunate events\nThe author of the book is: Liam Thompton\nThe publish date of the book is: 12/20/2021\nThe book is: Available");

    }
}