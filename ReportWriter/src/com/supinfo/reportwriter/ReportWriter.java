/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supinfo.reportwriter;

import com.supinfo.reportwriter.models.Employee;
import com.supinfo.reportwriter.models.Student;
import com.supinfo.reportwriter.models.SubContractor;
import com.supinfo.reportwriter.models.Worker;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Alexis
 */
public class ReportWriter {
    private static final String[] FIRST_NAMES = { "Jean-Kebab", "Alain", "Micheline", "Georgette", "Bob", "Gédéon", "Xavière", "Germaine", "Pénélope" };
    private static final String[] LAST_NAMES = { "Missouri", "Exemple", "LeBricoleur", "DuPneu", "Fillon", "Chirac" };
    private static final String[] SCHOOLS = { "Supinfo", "Epitech", "Ludius Academy", "42", "Rocco Sifredi's School", "Les Mines" };
    
    private static <T> T randomOf(final T[] arr, final Random rand) {
        return arr[rand.nextInt(arr.length)];
    }
    
    private static Worker generateWorker() {
        final Random rand = new Random();
        final String name = randomOf(FIRST_NAMES, rand) + " " + randomOf(LAST_NAMES, rand);
        
        switch (rand.nextInt(3)) {
            case 0:
                return new Employee(
                    name,
                    rand.nextInt(10000),
                    rand.nextInt(25)
                );
            case 1:
                return new SubContractor(
                    name, 
                    rand.nextInt(1000)
                );
            default:
                return new Student(name, randomOf(SCHOOLS, rand));       
        }
    }
    
    private static void displayPage(int nb) {
        System.out.println("\t\t\tpage " + nb);
        System.out.println("");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final List<Worker> workers = new ArrayList<>();
        
        for(int i = 0 ; i < 100 ; i++) {
            workers.add(generateWorker());
        }
        
        workers.sort((w1, w2) -> w1.getName().compareToIgnoreCase(w2.getName()));
        
        for(int i = 0 ; i < workers.size() ; i++) {
            System.out.println(workers.get(i).toString());
            System.out.println("");
            
            if((i + 1) % 3 == 0)
                displayPage((i + 1) / 3);
            else if(i == workers.size() - 1)
                displayPage((i + 1) / 3 + 1);
        }
    }
    
}
