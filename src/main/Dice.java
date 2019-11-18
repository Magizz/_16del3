package main;

import java.util.Random;

public class Dice {

    private int die;

    public int dieHit() {
        int die;
        Random rand = new Random();
        die = rand.nextInt(6) + 1;
        return die;
    }

    public String toString() {
        String dieHitString = Integer.toString(dieHit());
        return dieHitString;
    }
}
