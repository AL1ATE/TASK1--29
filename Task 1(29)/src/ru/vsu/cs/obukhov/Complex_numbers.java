package ru.vsu.cs.obukhov;

public class Complex_numbers {
    public double valid;
    public double imaginary;

    public void plus(Complex_numbers other){
        this.valid += other.valid;
        this.imaginary += other.imaginary;
    }

    public static Complex_numbers plus(Complex_numbers complex1, Complex_numbers complex2){
        return new Complex_numbers(complex1.valid+complex2.valid, complex1.imaginary+complex2.imaginary);
    }

    public void minus(Complex_numbers other){
        this.valid -= other.valid;
        this.imaginary -= other.imaginary;
    }

    public static Complex_numbers minus(Complex_numbers complex1, Complex_numbers complex2){
        return new Complex_numbers(complex1.valid-complex2.valid, complex1.imaginary-complex2.imaginary);
    }

    public void multi(Complex_numbers other){
        valid *= other.valid;
        imaginary *= other.imaginary;
    }

    public static Complex_numbers multi(Complex_numbers complex1, Complex_numbers complex2){
        return new Complex_numbers(complex1.valid*complex2.valid, complex1.imaginary*complex2.imaginary);
    }

    public void X(double x){
        this.valid *= x;
        this.imaginary *= x;
    }

    public void print(){
        if(this.imaginary < 0){
            System.out.println(this.valid+" - "+Math.abs(this.imaginary)+"i");
        }
        if(this.imaginary > 0){
            System.out.println(this.valid+" + "+this.imaginary+"i");
        }
    }

    public Complex_numbers(double valid, double imaginary) {
        this.valid += valid;
        this.imaginary += imaginary;
    }

}


