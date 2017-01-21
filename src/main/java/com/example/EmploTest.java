package com.example;

/**
 * Created by zgret on 2017-01-21.
 */
public class EmploTest {

    public static void main(String[] args) {
        Secretary sec = new Secretary("Marian", "Asda", "secretary", 23, 500);
        Ordinary ord = new Ordinary("Jer", "Qewe", "ordinary", 65, 500);

        sec.printSalary();
        ord.printSalary();


        System.out.println(sec);
        System.out.println(ord);

    }
}