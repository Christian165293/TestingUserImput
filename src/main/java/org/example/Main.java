package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("please input your name into the consol");
        String input = System.console().readLine();
        System.out.println("hello " + input);
    }
}