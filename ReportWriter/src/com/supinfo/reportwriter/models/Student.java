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
public class Student extends Worker {
    private String school;

    public Student(String name, String school) {
        super(name);
        this.school = school;
    }

    @Override
    public String toString() {
        return name + "\n" + this.school;
    }
    
    
    // GETTERS AND SETTERS
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
    
}
