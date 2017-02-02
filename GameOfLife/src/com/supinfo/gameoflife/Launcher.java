package com.supinfo.gameoflife;

import java.util.Scanner;

public class Launcher {

    /**
     * @param args
     */
    public static void main(String[] args) throws InterruptedException {

        World world = new World(10, 10);

        for (int i = 0; i < 100; i++) {
            world.newGeneration();

            System.out.println("World n°" + (i + 1) + " : \n");
            System.out.println(world);

            Thread.sleep(1000);
        }
    }

}
