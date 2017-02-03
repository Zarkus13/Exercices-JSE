/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supinfo.characterscount;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Alexis
 */
public class CharactersCount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean cont = true;
        final Map<Character, Integer> characters = new HashMap<>();
        
        System.out.println("Please enter a file name :");
        
        while(cont) {
            final String path = new Scanner(System.in).nextLine();
            final File file = new File(path);
            
            if(file.exists()) {
                try(FileReader reader = new FileReader(file)) {
                    char[] buffer = new char[10];
                    
                    while(reader.read(buffer) > -1) {
                        for(char c : buffer) {
                            if(characters.containsKey(c))
                                characters.put(c, characters.get(c) + 1);
                            else
                                characters.put(c, 1);
                        }
                    }
                    
                    cont = false;
                } catch (FileNotFoundException e) {
                    System.out.println("Please, enter a valid file name :");
                } catch (Exception e) {
                    System.out.println("An error occured while reading the file");
                    cont = false;
                }
            } else {
                System.out.println("Please, enter a valid file name :");
            }
        }
        
        characters
            .entrySet()
            .stream()
            .sorted((e1, e2) -> e1.getKey().compareTo(e2.getKey()))
            .forEach(e -> {
                System.out.println(e.getKey() + "(unicode: " + ((int) e.getKey()) + ") : " + e.getValue());
            });
    }
    
}
