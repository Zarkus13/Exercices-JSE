/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supinfo.arraysort;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Alexis
 */
public class Sorter {
    
    public static void main(String[] args) {
        int[] array = new int[10];
        Random rand = new Random();
        
        for(int i = 0 ; i < array.length ; i++) {
            array[i] = rand.nextInt(100);
        }
        
        displayArray(array);   
        
        System.out.println("Bubble sort :");
        displayArray(
            bubbleSort(
                copyArray(array)
            )
        );
        
        System.out.println("Insertion sort :");
        displayArray(
            insertionSort(
                copyArray(array)
            )
        );
        
        System.out.println("Selection sort :");
        displayArray(
            selectionSort(
                copyArray(array)
            )
        );
    }
    
    public static void displayArray(int[] array) {
        System.out.println("Array :");
        for(int i = 0 ; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }
    
    public static int[] copyArray(int[] array) {
        return Arrays.copyOf(array, array.length);
    }
    
    public static int[] bubbleSort(int[] array) {
        boolean hasChanged;
        
        do {
            hasChanged = false;
            for(int i = 0 ; i < array.length - 1 ; i++) {
                int a1 = array[i];
                int a2 = array[i + 1];

                if(a1 > a2) {
                    hasChanged = true;
                    array[i] = a2;
                    array[i + 1] = a1;
                }
            }
        } while (hasChanged);
        
        return array;
    }
    
    public static int[] insertionSort(int[] array) {
        int[] newArray = new int[array.length];
        
        for(int i = 0 ; i < array.length ; i++) {
            int a = array[i];
            
            for(int j = 0 ; j <= i ; j++) {
                if(j == i)
                    newArray[j] = a;
                else if(a < newArray[j]) {                    
                    for(int k = i ; k > j ; k--) {
                        newArray[k] = newArray[k - 1];
                    }
                    
                    newArray[j] = a;
                    break;
                }
            }
        }
        
        return newArray;
    }
    
    public static int[] selectionSort(int[] array) {
        for(int i = 0 ; i < array.length ; i++) {
            int minID = i;

            for(int j = i ; j < array.length ; j++) {
                if(array[j] < array[minID]) {
                    minID = j;
                }
            }
            
            int a = array[minID];
            
            array[minID] = array[i];
            array[i] = a;
        }
        
        return array;
    }
    
}
