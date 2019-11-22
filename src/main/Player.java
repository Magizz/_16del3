package main;

import Tiles.Property;

public class Player {

     private String name;
     private Bank bal = new Bank();
     private int age;
     private int tilePosition;
     private Property ownedProperty[] = new Property[12];

    public Player () {
        name = "";
        age = 0;
        tilePosition = 0;
    }
    public Player (String n, int a) {
        name = n;
        age = a;
        tilePosition = 0;
    }

    //Accessor
    public String getName() { return name; }
    public int getBal() { return bal.getMoney(); }
    public int getAge() { return age; }
    public int getTilePosition() { return tilePosition; }

    //Mutator
    public void setTilePosition( int tp ) { tilePosition = tp; }
    public void setName(String n) { name = n; }
    public void setAge(int a) { age = a; }
    public void setBal(int b) { bal.setMoney(b); }

    //toString
    public String toString() {
        String output = "Name: " + getName() +
                        "\nAge: " + getAge() +
                        "\nBalance: " + getBal() + " MonopolyBucks" +
                        "Position = Tile:" + getTilePosition();
        return output;
    }

    public void players (int antalSpillere){
           Player[] player = new Player[antalSpillere];
           player.
        }

    public void startBal (int spiller){
        if (spiller == 2) { setBal(20); }
        else if (spiller == 3){ setBal(18); }
        else { setBal(16); }
    }


}

