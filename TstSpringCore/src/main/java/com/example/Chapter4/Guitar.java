package com.example.Chapter4;

/*@Qualifier("stringed")*/
public class Guitar implements Instrument {
    public void play() {
        System.out.println("Strum strum strum");
    }
}