package behaviour.association.composition;

import behaviour.association.composition.Book;
import behaviour.association.composition.Library;

import java.util.List;

/**
 * Composition: unidirectional relationship 'part of'
 * If lib gets destroyed then all books also be destroyed, Book is part of library
 * Ex: A file containing in Directory, if Directory is deleted all file are also be deleted.
 * Car have an engine, Directory have a file.Library have a book,
 * LinkedList class having the Node class if In case LinkedList class are destroyed the Node itself destroyed
 *
 *
 *
 */
public class Main {
    public static void main(String[] args) {
        Book cBook=new Book("C");
        Book javaBook=new Book("Java");

        Library library=new Library("my lib", List.of(cBook,javaBook));

    }
}
