package com.conor;

/**
 * Created by conor on 3/24/16.
 */
public class NameExclaim implements NameProcessor {

    public void process(String name) {
        System.out.println(name + "!!!!!!!!");
    }


    public int countLetters(String name) {
        return name.length();
    }
}
