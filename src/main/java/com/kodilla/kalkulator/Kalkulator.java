package com.kodilla.kalkulator;

public class Kalkulator {

    public void someMethod() {
        System.out.println("Witamy w kalkulatorze");
    }

    public int add(int a, int b) {
        return a+b;
    }

    public int sub(int a, int b) {
        return a-b;
    }

    public static void main(String args[]) {
        Kalkulator kalkulator = new Kalkulator();
        kalkulator.someMethod();
        System.out.println("Wynik dodawania 4 oraz 6 to: " + kalkulator.add(4,6));
        System.out.println("Wynik odejmowania 6 od 8 to: " + kalkulator.sub(8,6));
    }
}
