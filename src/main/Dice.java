package main;

import java.util.Random;

public class Dice {

    public static int dieHit() {
        int die;
        Random rand = new Random();
        die = rand.nextInt(6) + 1;
        return die;
    }
}
