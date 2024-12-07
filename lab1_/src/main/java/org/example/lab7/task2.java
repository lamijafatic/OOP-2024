package org.example.lab7;
import java.util.Optional;


public class task2 {


    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("1984", "George Orwell", "123456789", "Available"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "987654321", "Checked Out"));
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "111222333", "Reserved"));

        String searchISBN = "987654321";
        Book defaultBook = new Book("Default Title", "Default Author", "000000000", "Unavailable");
        Book foundBook1 = library.findBookByISBN(searchISBN).orElse(defaultBook);
        System.out.println("Using orElse: " + foundBook1);


        Book foundBook2 = library.findBookByISBN("nonexistentISBN").orElseGet(() ->
                new Book("Lazy Default Title", "Lazy Default Author", "999999999", "Unavailable"));
        System.out.println("Using orElseGet: " + foundBook2);


        try {
            Book foundBook3 = library.findBookByISBN("criticalISBN")
                    .orElseThrow(() -> new BookNotFund("Book with ISBN criticalISBN not found!"));
            System.out.println("Using orElseThrow: " + foundBook3);
        } catch (BookNotFund e) {
            System.out.println("Using orElseThrow: " + e.getMessage());
        }
    }
}
