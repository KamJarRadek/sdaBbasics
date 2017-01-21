package com.example;

/**
 * Created by zgret on 2017-01-21.
 */
public abstract class Employee {

    private String name = "";
    private String surName = "";
    private String occupation = "";
    private int age, salary;

    public void printSalary(){
        System.out.println(getSalary());
    }

    public double getSalary(){
        return salary*getMultiplicator();
    }
    protected  abstract double getMultiplicator();
}
