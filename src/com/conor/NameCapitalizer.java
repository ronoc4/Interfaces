package com.conor;

/**
 * Created by conor on 3/24/16.
 */
public class NameCapitalizer implements NameProcessor{

    public void process(String name) {
        String nameInUppercase = name.toUpperCase();
        System.out.println("Here is your name in uppercase");
        System.out.println(nameInUppercase);
    }

    public int countLetters(String name) {
        return name.length();

    }

}
