import java.util.Scanner;

public class Player {

     private String name;
     private int bal;
     private int age;
     private int tilePosition;

    public Player (String n,int b, int a, int p) {
        name = n;
        bal = b;
        age = a;
        tilePosition = p;
    }

    public String getName() { return name; }
    public int getBal() { return bal; }
    public int getAge() { return age; }
    public int getTilePosition() { return tilePosition; }



    public void players (String[] name, int antalSpillere) {
        String[] p = {};
        int[] bal = {};
        int[] age = {};
        int[] tilePosition = {};

         for (int i = 0; i <antalSpillere; i++) {
            p[i] = name[i];
            bal[i] = 20;
        }
    }
}