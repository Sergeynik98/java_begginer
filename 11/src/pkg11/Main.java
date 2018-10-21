/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number =10;
        int[] numbers = new int[5];
        for(int i =0; i<numbers.length; i++){
            numbers[i]= i+ 1;
        }
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
        System.out.println();
        int[] numbers1={1,2,3};
         for(int i=0;i<numbers1.length;i++){
            System.out.println(numbers1[i]);
         }
    }
    
}
