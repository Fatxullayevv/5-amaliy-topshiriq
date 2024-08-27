package org.example;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MathFunctions mathFunctions= new MathFunctions();
        System.out.println(mathFunctions.add(4,5));
        System.out.println(mathFunctions.sub(10,5.5));
        System.out.println(mathFunctions.multiply(45, 2));
        System.out.println(mathFunctions.abs(-25));
        System.out.println(mathFunctions.pow(10));
    }
}