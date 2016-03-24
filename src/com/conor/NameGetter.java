package com.conor;

import java.util.Scanner;

public class NameGetter {

    public static void main(String[] args) {

        //Ask user for name
        //Send name to be processed.

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = scanner.nextLine();


        NameProcessor processor = new NameCapitalizer();
        processor.process(name);
        System.out.println("Here are how many letters are in your name: " + processor.countLetters(name));

        NameSaver nameSaver = new NameSaver();
        nameSaver.process(name);

        NameExclaim exclaim = new NameExclaim();
        exclaim.process(name);

        System.out.println("Thank you - I have processed your name.");
        scanner.close();
    }
}
