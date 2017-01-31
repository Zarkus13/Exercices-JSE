/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supinfo;

/**
 *
 * @author Alexis
 */
public class FizzBuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i = 1 ; i <= 100 ; i++) {
            if(i % 3 == 0 && i % 5 == 0)
                System.out.print("fizzbuzz");
            else if(i % 3 == 0)
                System.out.print("fizz");
            else if(i % 5 == 0)
                System.out.print("buzz");
            else
                System.out.print(i);
            
            if(i % 10 == 9)
                System.out.println("");
            else
                System.out.print(" ");
        }
    }
    
}
