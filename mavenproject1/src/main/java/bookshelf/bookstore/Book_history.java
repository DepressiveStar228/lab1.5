/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookshelf.bookstore;

/**
 *
 * @author artem
 */
public class Book_history extends Book{
    
    Book_history(){
        this.genre= "History";
    }
    
    @Override
    public void printContent() {
        System.out.println(this.getISBN()+":"+this.getGenre()+","+this.getPages()+"pp.");
    }
    
}
