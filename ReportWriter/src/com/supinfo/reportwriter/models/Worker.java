/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supinfo.reportwriter.models;

/**
 *
 * @author Alexis
 */
public abstract class Worker {
    protected String name;

    public Worker(String name) {
        this.name = name;
    }
    
    public abstract String toString();
    
    // GETTERS AND SETTERS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
