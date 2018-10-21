/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10;

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
        System.out.println("Введи возраст");
        int age = scanner.nextInt();
        switch(age){
            case 0 :
                System.out.println("Ты родился");
                break;
            case 7 :
                System.out.println("Ты пошёл в школу");
                break;
            case 18 :
                System.out.println("Ты закончил школу");
                break;
                
        }
    }
    
}
