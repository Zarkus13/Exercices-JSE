/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supinfo.collectionsexamples;

import java.util.Comparator;

/**
 *
 * @author Alexis
 */
public class MuffinColorComparator implements Comparator<Muffin> {

    @Override
    public int compare(Muffin m1, Muffin m2) {
        return m1.getColor().compareTo(m2.getColor());
    }
    
}
