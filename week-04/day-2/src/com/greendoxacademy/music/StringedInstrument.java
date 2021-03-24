package com.greendoxacademy.music;

public class StringedInstrument  extends  Instrument{

   protected int numberOfStrings;

    protected void sound() {

    }

    @Override
    public void play() {

    }
}
/*
Next, we add another abstract class, StringedInstrument which extends Instrument. It

        introduces numberOfStrings and
        sound() method what's implementation is yet unknown
        but with the help of the sound() the play() method is fully implementable
 */
