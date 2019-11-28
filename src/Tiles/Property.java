package Tiles;

import Tiles.Tile;
import main.Player;

public class Property extends Tile {
    private String name;
    private int price;
    private boolean isOwned;
    private int rent;
    private main.Player owner;

    // Constructors
    public Property() {};
    public Property(String sName, int sPrice, int sRent, int ID) {
        isOwned = false;
        name = sName;
        price = sPrice;
        rent = sRent;
        tileID = ID;
    }

    // Accessors
    public int getPrice() { return price; }
    public int getRent() { return rent; }
    public String getName() { return name; }
    public boolean getIsOwned() { return isOwned; }
    public Player getOwner() {
        return owner;
    }

    // Mutators
    public void setIsOwned(boolean isOwned) { this.isOwned = isOwned; }
    public void setOwner(Player playerObj) {this.owner = playerObj; }

    // toString
    public String toString() {
        String output = "Name: " + getName() +
                "\nPrice " + getPrice() +
                "\nRent: " + getRent();
        return output;
    }


}