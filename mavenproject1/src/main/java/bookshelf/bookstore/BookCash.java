/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookshelf.bookstore;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author artem
 */
public class BookCash {
    private static final Map <Integer, Book > bookMap = new HashMap <> ();
    
    public static Book getBook(int id) throws CloneNotSupportedException {
        Book toBeClonedBook = bookMap.get(id);
        return (Book) toBeClonedBook.clone();
    }

    public static void loadCache() {
        Book_fantasy fb1 = new Book_fantasy();
        bookMap.put(1, fb1);

        Book_comix cb1 = new Book_comix();
        cb1.setColor(true);
        bookMap.put(2, cb1);
        
        Book_history hb1 = new Book_history();
        cb1.setColor(true);
        bookMap.put(3, hb1);
    }
}
