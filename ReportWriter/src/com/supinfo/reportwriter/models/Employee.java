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
public class Employee extends Worker {
    private Integer salary;
    private Integer vacations;

    public Employee(String name, Integer salary, Integer vacations) {
        super(name);
        this.salary = salary;
        this.vacations = vacations;
    }
    
    public String toString() {
        return name + "\n€" + this.salary + "/month, " + this.vacations + " days";
    }
    
    
    // GETTERS AND SETTERS

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getVacations() {
        return vacations;
    }

    public void setVacations(Integer vacations) {
        this.vacations = vacations;
    }
    
}
