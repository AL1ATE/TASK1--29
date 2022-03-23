package ru.vsu.cs.obukhov;

public class Main {

    public static void main(String[] args) {
        Complex_numbers z1 = new Complex_numbers(3, -5);
        Complex_numbers z2 = new Complex_numbers(4, 2);
        z1.plus(z2);
        z1.minus(z2);
        z1.multi(z2);
        z1.print();
        z1.X(3);
        z1.print();

    }
}
