package development;

import dataType.Book;

import javax.swing.*;

public class Runner {

    public static void main(String[] args) {
        Book obj = new Book("A series of fortunate events", "Liam Thompton", "12/20/2021");
        obj.printBook();
        System.out.println("Hello, World!");
    }


}
