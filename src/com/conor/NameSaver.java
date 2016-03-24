package com.conor;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by conor on 3/24/16.
 */
public class NameSaver implements NameProcessor {

    public void process(String name) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("name.txt"));
            writer.write(name);
            writer.close();
            System.out.println("Have saved your name to name.txt");

        } catch (IOException ex) {
            System.out.println("Sorry, error");
        }
    }

    public int countLetters(String name) {
        return name.length();
    }
}
