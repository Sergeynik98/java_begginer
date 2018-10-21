/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int value;
       do{
           System.out.println("Введи 5");
           value=scanner.nextInt();
       }while(value!=5);
       System.out.println("Вы ввели 5");
    }
    
}
