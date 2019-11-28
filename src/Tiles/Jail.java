package Tiles;

import Controller.UIController;

public class Jail extends Tile {

    UIController uiObj = new UIController();
    // Contrusctor
    public Jail(int ID) { this.tileID = ID; }

    // Go to Jail
    public void landOnJail (main.Player playerObj) {
        playerObj.setTilePosition(18);
        uiObj.showMessage("Du røg i spjældet og betalte 2 MonopolyBucks for at komme ud næste tur.");
        playerObj.setBal(playerObj.getBal()-2);
    }

    // Visit Jail
    public void landOnVisit (){
        uiObj.showMessage("Bare rolig bror, du er bare på besøg");
    }



}
