/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=0;i<=15;i++){
            if(i%2==0){
                continue;
            }
            System.out.println("Это нечетное число "+i);
        }
    }
    
}
