package com.supinfo.gameoflife;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Launcher {

    /**
     * @param args
     */
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int nbCols = 0, nbRows = 0;
        int minCols = 10, minRows = 10;
        
        System.out.println("Please, enter a number of columns :");
        for(boolean cont = true ; cont ;) {
            try {
                nbCols = new Scanner(System.in).nextInt();
                
                if(nbCols < minCols)
                    throw new InputMismatchException();
                
                cont = false;
            } catch (InputMismatchException e) {
                System.out.println("Please, enter a valid number of columns (min " + minCols + ")");
            }
        }
        
        System.out.println("Please, enter a number of rows :");
        for(boolean cont = true ; cont ;) {
            try {
                nbRows = new Scanner(System.in).nextInt();
                
                if(nbRows < minRows)
                    throw new InputMismatchException();
                
                cont = false;
            } catch (InputMismatchException e) {
                System.out.println("Please, enter a valid number of rows (min " + minRows + ")");
            }
        }

        World world = new World(nbCols, nbRows);

        for (int i = 0; i < 3; i++) {
            world.newGeneration();

            System.out.println("World n°" + (i + 1) + " : \n");
            System.out.println(world);

            Thread.sleep(1000);
        }
    }

}
