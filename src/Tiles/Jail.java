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
        else if (playerObj.getTilePosition() == 18 && playerObj.getJailFreeCard()==true ) {
            //uiObj.showMessage("Du kører for stærkt! Du får en bøde på 2 M, og bruger din tur i kachotten.");
            playerObj.setTilePosition(6);
            playerObj.setJailFreeCard(false);
        }
        else {
            playerObj.setTilePosition(6);
            playerObj.setBal(playerObj.getBal()-2);
        }

    }
}
