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

    public void landOnField(Player playerObj) {
        if (!buyProperty(playerObj, this)) {
            payRent(playerObj, this);
        }
        else {
            buyProperty(playerObj, this);
        }
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

    public boolean buyProperty(Player playerObj, Property propertyObj){
        if (propertyObj.getIsOwned()) {
            return false;
        }
        if (playerObj.getNumberPropertiesOwned() >= playerObj.getMaxProperties()){
            return false;
        }
        int price = propertyObj.getPrice();
        int currentBalance = playerObj.getBal();
        playerObj.setBal(currentBalance-price);
        propertyObj.setIsOwned(true);
        playerObj.setOwnedProperty(playerObj.getNumberPropertiesOwned(), propertyObj);
        playerObj.setNumberPropertiesOwned(playerObj.getNumberPropertiesOwned()+1);
        return true;
    }
    public void payRent(Player playerObj, Property propertyObj) {
        playerObj.setBal(playerObj.getBal()-propertyObj.getPrice());
        int ownerBal = propertyObj.getOwner().getBal();
        propertyObj.getOwner().setBal(ownerBal+propertyObj.getPrice());
    }

    // toString
    public String toString() {
        String output = "Name: " + getName() +
                "\nPrice " + getPrice() +
                "\nRent: " + getRent();
        return output;
    }


}