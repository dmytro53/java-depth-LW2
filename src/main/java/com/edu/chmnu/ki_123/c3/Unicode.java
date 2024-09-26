package com.edu.chmnu.ki_123.c3;

public class Unicode {
    public static void main(String[] args) {
        char pilSign = '\u00B6';
        char plusMinusSymbol = '\u00B1';
        char oneQuarter = '\u00BC';
        char withDiaeresis = '\u00D6';
        char numberThree = '\u0033';

        System.out.println("Stored Unicode Characters using Escape Sequences:");
        System.out.println("Pilcrow Sign: " + pilSign);
        System.out.println("Plus minus symbol: " + plusMinusSymbol);
        System.out.println("Vulgar Fraction One Quarter: " + oneQuarter);
        System.out.println("Latin Capital Letter O with Diaeresis: " + withDiaeresis);
        System.out.println("Digit Three: " + numberThree);
    }
}