package Tiles;
import main.Player;
import Controller.*;
public class Jail extends Tile {
    //UIController uiObj = new UIController();
    // Contrusctor
    public Jail(int ID) { this.tileID = ID; }

    public void landOnField(Player playerObj) {
        if (playerObj.getTilePosition()== 6) {

        }
        else {
            //uiObj.showMessage("Du kører for stærkt! Du får en bøde på 2 M, og bruger din tur i kachotten.");
            playerObj.setBal(playerObj.getBal()-2);
            playerObj.setTilePosition(6);
        }
    }
}
