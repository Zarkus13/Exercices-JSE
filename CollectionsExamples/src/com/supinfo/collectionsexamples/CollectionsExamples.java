/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supinfo.collectionsexamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 *
 * @author Alexis
 */
public class CollectionsExamples {
    
    public static Color[] colors = { Color.BLUE, Color.GREEN, Color.PINK, Color.RED, Color.YELLOW };
    public static String[] tastes = { "vanille", "Schtroumpf", "pistache", "chocolat", "bubble gum" };
    
    public static Muffin generateMuffin() {
        Random rand = new Random();
        
        return new Muffin(
            colors[rand.nextInt(colors.length)],
            tastes[rand.nextInt(tastes.length)],
            rand.nextInt(20)
        );
    }
    
    public static void displayMuffins(List<Muffin> muffins) {        
        muffins.forEach(m -> System.out.println(m));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        List<Muffin> muffins = new ArrayList<>();
        
        for(int i = 0 ; i < 10 ; i++) {
            muffins.add(generateMuffin());
        }
        
        System.out.println("By diameter :");
        Collections.sort(muffins);
        
        displayMuffins(muffins);
        
        System.out.println("\nBy Color :");
        Collections.sort(
            muffins, 
            (m1, m2) -> m1.getColor().compareTo(m2.getColor())
        );
        
        displayMuffins(muffins);
        
        System.out.println("\nBy taste :");
        muffins.sort((m1, m2) -> m1.getTaste().compareTo(m2.getTaste()));
        
        displayMuffins(muffins);
        
        List<Integer> diameters = 
            muffins
                .stream()
                .map(Muffin::getDiameter)
                .sorted((d1, d2) -> -d1.compareTo(d2))
                .filter(d -> d > 10)
                .collect(Collectors.toList());
        
        diameters.forEach(d -> System.out.println(d));
    }
    
}
