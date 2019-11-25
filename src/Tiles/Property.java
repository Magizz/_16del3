package Tiles;

import Tiles.Tile;

public class Property extends Tile {
    private String name;
    private int price;
    private boolean isOwned;
    private int rent;

    // Constructors
    public Property() {};
    public Property(String sName, int sPrice, int sRent, int sTileID) {
        isOwned = false;
        name = sName;
        price = sPrice;
        rent = sRent;
        tileID = sTileID;
    }

    // Accessors
    public int getPrice() { return price; }
    public int getRent() { return rent; }
    public String getName() { return name; }
    public boolean getIsOwned() { return isOwned; }

    // Mutators
    public void setIsOwned(boolean isOwned) { this.isOwned = isOwned; }

    // toString
    public String toString() {
        String output = "Name: " + getName() +
                "\nPrice " + getPrice() +
                "\nRent: " + getRent();
        return output;
    }

    public void propertiesInitializer() {
        Property Burgerbaren = new Property("Burgerbaren", 1, 1, 1 );
        Property Pizzariaet = new Property("Pizzariaet", 1, 1, 2 );
        Property Slikbutikken = new Property("Slikbutikken", 1, 1, 4 );
        Property Iskiosken = new Property("Iskiosken", 1, 1, 5 );
        Property Museet = new Property("Museet", 2, 2, 7 );
        Property Biblioteket = new Property("Biblioteket", 2, 2, 8 );
        Property Skaterparken = new Property("Skaterparken", 2, 2, 10 );
        Property Swimmingpoolen = new Property("Swimminpoolen", 2, 2, 11 );
        Property Spillehallen = new Property("Spillehallen", 3, 3, 13 );
        Property Biografen = new Property("Biografen", 3, 3, 14 );
        Property Lejetøjsbutikken = new Property("Lejetøjsbutikken", 3, 3, 16 );
        Property Dyrehandlen = new Property("Dyrehandlen", 3, 3, 17 );
        Property Bowlinghallen = new Property("Bowlinghallen", 4, 4, 19 );
        Property Zoo = new Property("Zoo", 4, 4, 20 );
        Property Vandlandet = new Property("Vandlandet", 5, 5, 22 );
        Property Strandpromenaden = new Property("Strandpromenaden", 5, 5, 23 );
    }
}