/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supinfo.collectionsexamples;

/**
 *
 * @author Alexis
 */
enum Color {
    RED, BLUE, YELLOW, PINK, GREEN
}

public class Muffin implements Comparable<Muffin> {
    private Color color;
    private String taste;
    private Integer diameter;
    
    public Muffin() {}

    public Muffin(Color color, String taste, Integer diameter) {
        this.color = color;
        this.taste = taste;
        this.diameter = diameter;
    }

    @Override
    public int compareTo(Muffin m) {
        return diameter.compareTo(m.diameter);
    }
       
    
    
    // GETTERS AND SETTERS

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public Integer getDiameter() {
        return diameter;
    }

    public void setDiameter(Integer diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Muffin " + color + " goût " + taste + ", de " + diameter + " cm de diamètre";
    }
    
    
}
