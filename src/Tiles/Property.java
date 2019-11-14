package Tiles;

import Tiles.Tile;

public class Property extends Tile {
    private String name;
    private int price;
    private String color;


    public Property() {

    }

    //Accessors
    public int getPrice() { return price; }
    public String getName() { return name; }
    public String getColor() { return color; }

    //toString
    public String toString() {
        String output = "Name: " + getName() +
                "\nPrice " + getPrice() +
                "\nColor: " + getColor();

        return output;
    }
}