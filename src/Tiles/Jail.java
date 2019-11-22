package Tiles;

import Controller.UIController;

public class Jail {

    UIController UI = new UIController();

    // Go to Jail
    public void landOnTile18 (main.Player p) {
        p.setTilePosition(18);
    }

    // Visit Jail
    public void landOnTile6 (){
        UI.showMessage("Bare rolig bror, du er bare på besøg");

    }
}
