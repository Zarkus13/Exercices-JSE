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
public class SubContractor extends Worker {
    private Integer rate;

    public SubContractor(String name, Integer rate) {
        super(name);
        this.rate = rate;
    }

    @Override
    public String toString() {
        return name + "\n€" + this.rate + "/day";
    }

    
    // GETTERS AND SETTERS

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }
    
}
