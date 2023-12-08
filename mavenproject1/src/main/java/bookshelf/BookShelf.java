/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookshelf;

import bookshelf.bookstore.Book;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author artem
 */
public class BookShelf {
    private static BookShelf instance;
    private final List<Book> storage;
    
    private BookShelf(){
    this.storage=new LinkedList<>();
    }
    
    public static BookShelf getInstance(){
        if(instance==null){
            instance=new BookShelf();
        }
        return instance;
    }
    
    public void addBook(Book book) {
        storage.add(book);
    }
    
    public void removeBook(int isbn) {
        Iterator<Book> iterator = storage.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getISBN() == isbn) {
                iterator.remove();
                System.out.println("Книга с ISBN " + isbn + " удалена.");
                return;
            }
        }
        System.out.println("Книга с ISBN " + isbn + " не найдена на полке.");
    }
       
    public void printContent(){
        System.out.println("On my shelf:");
        for(Book b:storage){
            b.printContent();
        }
    }
    
    public boolean checkEmpty(){
        return storage.isEmpty();
    }
}
