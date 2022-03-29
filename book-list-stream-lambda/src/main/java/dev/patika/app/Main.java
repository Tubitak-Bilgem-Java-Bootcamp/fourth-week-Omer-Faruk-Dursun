package dev.patika.app;

import dev.patika.app.book.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("Lord of the Rings", 600, "JRR Tolkien", 1976));
        books.add(new Book("Little Prince", 400, "Antoine de Saint-Exupéry", 1976));
        books.add(new Book("The Hound of the Baskervilles", 750, "Arthur Conan Doyle", 1976));
        books.add(new Book("1984", 300, "George Orwell", 1976));
        books.add(new Book("Animal Farm", 180, "George Orwell", 1976));
        books.add(new Book("To Kill a Mockingbird", 92, "Harper Lee", 1976));
        books.add(new Book("The Great Gatsby", 83, "F. Scott Fitzgerald", 1976));
        books.add(new Book("One Hundred Years of Solitude", 456, "Gabriel García Márquez", 1976));
        books.add(new Book("A Passage to India", 464, "E.M. Forster", 1976));
        books.add(new Book("Don Quixote", 753, "Miguel de Cervantes", 1976));

        // Create Map<String, String> -> <Author Name, Book Name>
        System.out.println("\n---------------------------------------------------");
        System.out.println("Create Map<String, String> -> <Author Name, Book Name>");
        System.out.println("---------------------------------------------------");
        Map<String, String> bookMap = books.stream().collect(Collectors.toMap(Book::getBookName, Book::getAuthorName));

        for (var entry : bookMap.entrySet()) {
            System.out.println(entry.getKey() + "  /  " + entry.getValue());
        }

        System.out.println("---------------------------------------------------\n\n");

        // Return Books which have over 100 pages as a list
        System.out.println("Return Books which have over 100 pages as a list");
        System.out.println("---------------------------------------------------");
        List<Book> booksWithOverHundredPages = books.stream().filter(book -> book.getNumberOfPages() > 100).collect(Collectors.toList());

        for (Book book: booksWithOverHundredPages) {
            System.out.println(book.toString());
        }

    }

}
