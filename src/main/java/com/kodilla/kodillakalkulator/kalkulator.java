package com.kodilla.kodillakalkulator;

class Calc{

    public int dodawanie(int a, int b){
        return a + b;

    }

    public int odejmowanie(int a, int b){
        return a - b;
    }

}


public class kalkulator {
    public static void main(String[] args) {

        Calc calc = new Calc();
        System.out.println(calc.dodawanie(5,5));
        System.out.println(calc.odejmowanie(5,5));


    }
}
