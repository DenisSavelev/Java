package com.example.Chapter4;

import org.springframework.beans.factory.annotation.Autowired;

public class Instrumentalist implements Performer {

    @Autowired
    public Instrumentalist(Instrument instrument) {
        this.instrument = instrument;
    }

    public Instrumentalist() {

    }

    //<end id="autowire_constructor" />

    public void perform() throws PerformanceException {
        System.out.print("Playing " + song + " : ");
        instrument.play();
    }

    private String song;

    public void setSong(String song) {
        this.song = song;
    }

    public String getSong() {
        return song;
    }


    @Autowired
    private Instrument instrument;


    @Autowired
    public void heresYourInstrument(Instrument instrument) {
        this.instrument = instrument;
    }


    @Autowired
    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }



    public Instrument getInstrument() {
        return instrument;
    }
}