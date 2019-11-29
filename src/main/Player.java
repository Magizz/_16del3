package main;

import Tiles.Property;
import com.sun.deploy.panel.IProperty;

import java.awt.*;

public class Player {
    private static int maxProperties = 12;
    private String name;
    private Bank playerBank = new Bank();
    private int age;
    private int tilePosition = 0;
    private int numberPropertiesOwned = 0;
    private Property ownedProperty[] = new Property[maxProperties];
    private Property lastPropertyBought;
    private boolean jailFreeCard = false;
    private Color playerColor;


    public Player () {
        name = "";
        age = 0;
        tilePosition = 0;
        ownedProperty[0] = new Property();

    }

    public Player (String name, int initialMoney) {
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
    public Color getPlayerColor() {return playerColor; }
    public Property getLastPropertyBought() {return lastPropertyBought;}

    // Mutators
    public void setTilePosition( int tp ) { tilePosition = tp; }
    public void setName(String n) { name = n; }
    public void setAge(int a) { age = a; }
    public void setBal(int b) { playerBank.setMoney(b); }
    public void setJailFreeCard(boolean state) { jailFreeCard = state; }
    public void setNumberPropertiesOwned(int newNPO) {this.numberPropertiesOwned = newNPO; }
    public void setOwnedProperty(int index, Property propertyObj) {ownedProperty[index] = propertyObj;}
    public void setPlayerColor(java.awt.Color rgb) {playerColor = rgb;}
    public void setLastPropertyBought(Property lastPropertyBought) {
        this.lastPropertyBought = lastPropertyBought;
    }

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

