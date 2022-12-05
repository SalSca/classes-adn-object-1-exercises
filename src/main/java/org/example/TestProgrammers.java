package org.example;

public class TestProgrammers {
    public static void main(String[] args) {

        Programmer programmer1 = new Programmer("Fabrizio",21,false);
        programmer1.drinkCoffee();
        programmer1.printDetails();
        Programmer programmer2 = new Programmer("Marco",17,true);
        programmer2.printDetails();
        programmer2.hasGlasses();
    }
}