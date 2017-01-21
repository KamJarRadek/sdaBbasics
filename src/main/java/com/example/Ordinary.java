package com.example;

/**
 * Created by zgret on 2017-01-21.
 */
public class Ordinary extends  Employee {



        private String name = "";
        private String surName = "";
        private String occupation = "";
        private int age, salary;

        public Ordinary(String name, String surName, String occupation, int age, int salary) {
            this.name = name;
            this.surName = surName;
            this.occupation = occupation;
            this.age = age;
            this.salary = salary;
        }

    @Override
    public void printSalary() {
        super.printSalary();
    }

    @Override
        public String toString() {
            return "Secretary{" +
                    "name='" + name + '\'' +
                    ", surName='" + surName + '\'' +
                    ", occupation='" + occupation + '\'' +
                    ", age=" + age +
                    ", salary=" + getSalary() +
                    '}';
        }

    @Override
    protected double getMultiplicator() {
        return 1.19;
    }

    @Override
        public double getSalary() {
            return salary * getMultiplicator();
        }
    }
