/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numbers=new int[5];
        numbers[0]=10;
        String[] strings=new String[3];
        strings[0]= "Привет";
        strings[1]= "Пока";
        strings[2]= "Java";
        for(int i=0;i<strings.length;i++){
            System.out.println(strings[i]);
        }
        System.out.println();
        for(String string:strings){
         System.out.println(string);   
        }
        int[] numbers1={1,2,3};
        int sum=0;
        for(int x:numbers1){
           sum=sum+x;
        }
        System.out.println();
        System.out.println(sum);
        
        int value=0;
        String s=null;
         System.out.println(s);
        
    }
    
}
