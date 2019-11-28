package Tiles;
import gui_main.GUI;
import main.Player;
import java.util.Random;

public class Chance extends Tile{
    private String description;
    private GUI uiObj;

    public Chance(int ID) {
        this.tileID = ID;
    }
    public void drawChance(Player playerObj) {
        Random rand = new Random(8);
        int card = rand.nextInt()+1;
        switch (card) {
            case 1 :
                moveToStartChance(playerObj);
            case 2 :
                move5TilesChance(playerObj);
            case 3 :
                moveToOrangeFieldChance(playerObj);
            case 4:
                ateCandyChance(playerObj);
            case 5 :
                moveToLightBlueFieldChance(playerObj);
            case 6 :
                outOfJailChance(playerObj);
            case 7 :
                moveToStrandpromenaden(playerObj);
            case 8 :
                doneHomeworkChance(playerObj);
            case 9 :
                moveToRedFieldChance(playerObj);
            case 10 :
                moveToSkaterparkenChance(playerObj);
            default:
                System.out.println();
        }
    }

    // Chancekort metoder
    public void moveToStartChance(Player playerObj) {
        playerObj.setTilePosition(24);
        uiObj.displayChanceCard("Flyt frem til start!");
    }
    public void move5TilesChance(Player playerObj) {
        playerObj.setTilePosition(playerObj.getTilePosition()+5);
        uiObj.displayChanceCard("Flyt 5 felter frem!");
    }
    public void moveToOrangeFieldChance(Player playerObj) {
        playerObj.setTilePosition(7);
        uiObj.displayChanceCard("Ryk frem til det første orange felt!");
    }
    public void ateCandyChance(Player playerObj) {
        playerObj.setBal(playerObj.getBal()-2);
        uiObj.displayChanceCard("Du har spist alt for meget slik, du mister 2M. Åbenbart.");
    }
    public void moveToLightBlueFieldChance(Player playerObj) {
        playerObj.setTilePosition(4);
        uiObj.displayChanceCard("Ryk frem til det første lyseblå felt!");
    }
    public void outOfJailChance(Player playerObj) {
        playerObj.setJailFreeCard(true);
        uiObj.displayChanceCard("Du har trukket et FriForFængselKort, du slipper for fængsel næste gang du lander på Fængsel!");
    }
    public void moveToStrandpromenaden(Player playerObj) {
        uiObj.
        uiObj.displayChanceCard("Ryk frem til Strandpromenaden!");
    }
    public void doneHomeworkChance(Player playerObj) { playerObj.setBal(playerObj.getBal()+2); }
    public void moveToRedFieldChance(Player playerObj) {playerObj.setTilePosition(13); }
    public void moveToSkaterparkenChance(Player playerObj) {playerObj.setTilePosition(10);}


    public void landOnField(Player playerObj) {
        drawChance(playerObj);
    }
}
