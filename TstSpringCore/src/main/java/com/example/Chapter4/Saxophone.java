package com.example.Chapter4;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("woodwind")
public class Saxophone implements Instrument {
    public Saxophone() {
    }

    public void play() {
        System.out.println("PLINK PLINK PLINK");
    }
}