/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayreverse;

import java.util.Scanner;

/**
 *
 * @author mehta
 */
public class ArrayReverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //take input from user
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        
        char[] c= new char[word.length()];
        
        for(int i=0;i<word.length();i++)
        {
            c[i]=word.charAt(i);
        }
        
        //To print in reverse order
        for(int i=word.length()-1;i>=0;i--)
        {
            System.out.println(c[i]);
        }
        System.out.println("Bye");
    }
    
}
