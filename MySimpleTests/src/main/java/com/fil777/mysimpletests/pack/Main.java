package com.fil777.mysimpletests.pack;

/**
 *
 * @author Fil
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TextMessage message = new TextMessage("ope", "Oh wow, this printer knows how to print these as well!");

        ArrayList<String> pages = new ArrayList<>();
        pages.add("Values common to both {1, 3, 5} and {2, 3, 4, 5} are {3, 5}.");
        pages.add("Fil's test");
        Ebook book = new Ebook("Introduction to University Mathematics.", pages);

        Printer printer = new Printer();
        printer.print(message);
        printer.print(book);
    }
}
