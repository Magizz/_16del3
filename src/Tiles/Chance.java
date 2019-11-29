package Tiles;
import Controller.UIController;
import gui_fields.GUI_Player;
import gui_main.GUI;
import main.Player;
import java.util.Random;

public class Chance extends Tile{
    private String description;

    private UIController ui = UIController.getInstance();
    private GUI_Player[] guiPlayersObj;

    public Chance(int ID) {
        this.tileID = ID;
    }
    public void drawChance(Player playerObj) {
        Random rand = new Random();
        int card = rand.nextInt(9)+1;
        switch (card) {
            case 1 :
                moveToStartChance(playerObj);
                break;
            case 2 :
                move5TilesChance(playerObj);
                break;
            case 3 :
                moveToOrangeFieldChance(playerObj);
                break;
            case 4:
                ateCandyChance(playerObj);
                break;
            case 5 :
                moveToLightBlueFieldChance(playerObj);
                break;
            case 6 :
                outOfJailChance(playerObj);
                break;
            case 7 :
                moveToStrandpromenaden(playerObj);
                break;
            case 8 :
                doneHomeworkChance(playerObj);
                break;
            case 9 :
                moveToRedFieldChance(playerObj);
                break;
            case 10 :
                moveToSkaterparkenChance(playerObj);
                break;
            default:
                System.out.println();
                break;
        }
    }


    // Chancekort metoder
    public void moveToStartChance(Player playerObj) {
        ui.chanceMovePlayer(0,playerObj,checkPlayer(playerObj));
        ui.displayChanceCard("Flyt frem til start!");
    }
    public void move5TilesChance(Player playerObj) {
        ui.chanceMovePlayer(playerObj.getTilePosition()+5,playerObj,checkPlayer(playerObj));
        ui.displayChanceCard("Flyt 5 felter frem!");
    }
    public void moveToOrangeFieldChance(Player playerObj) {
        ui.chanceMovePlayer(7,playerObj,checkPlayer(playerObj));
        ui.displayChanceCard("Ryk frem til det første orange felt!");
    }
    public void ateCandyChance(Player playerObj) {
        playerObj.setBal(playerObj.getBal()-2);
        ui.displayChanceCard("Du har spist alt for meget slik, du mister 2M. Åbenbart.");
    }
    public void moveToLightBlueFieldChance(Player playerObj) {
        ui.chanceMovePlayer(4,playerObj,checkPlayer(playerObj));
        ui.displayChanceCard("Ryk frem til det første lyseblå felt!");
    }
    public void outOfJailChance(Player playerObj) {
        playerObj.setJailFreeCard(true);
        ui.displayChanceCard("Du har trukket et FriForFængselKort, du slipper for fængsel næste gang du lander på Fængsel!");
    }
    public void moveToStrandpromenaden(Player playerObj) {
        ui.chanceMovePlayer(23,playerObj,checkPlayer(playerObj));
        ui.displayChanceCard("Ryk frem til Strandpromenaden!");
    }
    public void doneHomeworkChance(Player playerObj) {
        playerObj.setBal(playerObj.getBal()+2);
        ui.displayChanceCard("Du har lavet dine lektier, du modtager 2 M!");
    }
    public void moveToRedFieldChance(Player playerObj) {playerObj.setTilePosition(13); }
    public void moveToSkaterparkenChance(Player playerObj) {playerObj.setTilePosition(10); }

    public GUI_Player checkPlayer (Player play) {
        guiPlayersObj = ui.getGUIPlayerObjArray();
        for (GUI_Player player :
                this.guiPlayersObj) {
            if (player.getName().equals(play.getName()))
                return player;
        }
        return null;
    }


    public void landOnField(Player playerObj) {
        drawChance(playerObj);
    }
}
