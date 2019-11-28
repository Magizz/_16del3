package main;

import Tiles.Property;
import com.sun.deploy.panel.IProperty;

public class Player {
    private static int maxProperties = 12;
    private String name;
    private Bank playerBank = new Bank();
    private int age;
    private int tilePosition = 0;
    private int numberPropertiesOwned = 0;
    private Property ownedProperty[] = new Property[maxProperties];
    private boolean jailFreeCard = false;


    public Player () {
        name = "";
        age = 0;
        tilePosition = 0;
        ownedProperty[0] = new Property();

    }

    public Player (String name, int age, int initialMoney) {
        playerBank.setMoney(initialMoney);
        this.name = name;
        this.age = age;
        tilePosition = 0;
    }

    // Accessors
    public String getName() { return name; }
    public int getBal() { return playerBank.getMoney(); }
    public int getAge() { return age; }
    public int getTilePosition() { return tilePosition; }
    public boolean getJailFreeCard() {return jailFreeCard; }
    public int getMaxProperties() {return maxProperties; }
    public int getNumberPropertiesOwned() {return numberPropertiesOwned; }
    public Property[] getOwnedProperty() {return ownedProperty; }

    // Mutators
    public void setTilePosition( int tp ) { tilePosition = tp; }
    public void setName(String n) { name = n; }
    public void setAge(int a) { age = a; }
    public void setBal(int b) { playerBank.setMoney(b); }
    public void setJailFreeCard(boolean state) { jailFreeCard = state; }
    public void setNumberPropertiesOwned(int newNPO) {this.numberPropertiesOwned = newNPO; }
    public void setOwnedProperty(int index, Property propertyObj) {ownedProperty[index] = propertyObj;}

    // toString
    public String toString() {
        String output = "Name: " + getName() +
                        "\nAge: " + getAge() +
                        "\nBalance: " + getBal() + " MonopolyBucks" +
                        "Position = Tile:" + getTilePosition();
        return output;
    }


    public void players (int antalSpillere){
           Player[] player = new Player[antalSpillere];
        }




}

