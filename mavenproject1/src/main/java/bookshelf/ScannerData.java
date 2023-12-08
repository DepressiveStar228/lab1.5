/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookshelf;

import java.util.Scanner;

/**
 *
 * @author artem
 */
public class ScannerData {
    Scanner scanner;
    
    public ScannerData(){
        this.scanner = new Scanner(System.in);
    } 

    public int scan_isbn(){
        while (true) {
            System.out.print("Введите ISBN книги для удаления: ");
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Пожалуйста, введите корректное данные.");
                scanner.next();
            }
        }       
    } 
    
    public char scan_command(){
         while (true) {
            System.out.println("Введите команду: ");
            if (scanner.hasNext()) {
                String input = scanner.next();
                if (input.length() == 1) {
                    return input.charAt(0);
                } else {
                    System.out.println("Пожалуйста, введите только один символ.");
                }
            } else {
                System.out.println("Пожалуйста, введите корректные данные.");
                scanner.next();
            }
        }     
    } 
}
