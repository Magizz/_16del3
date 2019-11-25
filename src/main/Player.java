package main;

import Tiles.Property;
import com.sun.deploy.panel.IProperty;

public class Player {
    private static int MaxProperties = 12;
    private String name;
    private Bank playerBal = new Bank();
    private int age;
    private int tilePosition;
    private int numberPropertiesOwned = 0;
    private Property ownedProperty[] = new Property[MaxProperties];

    public Player () {
        name = "";
        age = 0;
        tilePosition = 0;
        ownedProperty[0] = new Property();

    }

    public Player (String name, int age, int initialMoney) {
        playerBal.setMoney(initialMoney);
        this.name = name;
        this.age = age;
        tilePosition = 0;
    }

    // Accessors
    public String getName() { return name; }
    public int getBal() { return playerBal.getMoney(); }
    public int getAge() { return age; }
    public int getTilePosition() { return tilePosition; }

    // Mutators
    public void setTilePosition( int tp ) { tilePosition = tp; }
    public void setName(String n) { name = n; }
    public void setAge(int a) { age = a; }
    public void setBal(int b) { playerBal.setMoney(b); }

    // toString
    public String toString() {
        String output = "Name: " + getName() +
                        "\nAge: " + getAge() +
                        "\nBalance: " + getBal() + " MonopolyBucks" +
                        "Position = Tile:" + getTilePosition();
        return output;
    }

    public boolean buyProperty(Property property){
        if (property.getIsOwned() == true) {
            return false;
        }
        if (numberPropertiesOwned >= MaxProperties){
            return false;
        }
        int price = property.getPrice();
        int currentBalance = playerBal.getMoney();
        playerBal.setMoney(currentBalance-price);
        property.setIsOwned(true);
        ownedProperty[numberPropertiesOwned] = property;
        numberPropertiesOwned++;
        return true;
    }

    public void players (int antalSpillere){
           Player[] player = new Player[antalSpillere];
        }

    public void startBal (int spiller){
        if (spiller == 2) { setBal(20); }
        else if (spiller == 3){ setBal(18); }
        else { setBal(16); }
    }


}

