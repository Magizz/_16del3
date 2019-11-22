package Tiles;

import Tiles.Tile;

public class Property extends Tile {
    private String name;
    private int price;
    private String color;
    private boolean isOwned;
    private int rent;


    public Property() {
        isOwned = false;
    }

    //Accessors
    public int getPrice() { return price; }
    public String getName() { return name; }
    public String getColor() { return color; }
    public boolean getIsOwned() { return isOwned; }
    public void setIsOwned(boolean isOwned) { this.isOwned = isOwned; }

    //toString
    public String toString() {
        String output = "Name: " + getName() +
                "\nPrice " + getPrice() +
                "\nColor: " + getColor();


        return output;
    }
}