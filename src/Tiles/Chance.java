package Tiles;
import gui_main.GUI;
import main.Player;
import java.util.Random;

public class Chance extends Tile{
    private Chance[] ChanceArray = new Chance[24];
    private String description;
    private GUI uiObj;

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
    public void moveToStartChance(Player playerObj) {
        playerObj.setTilePosition(0);
        playerObj.setBal(playerObj.getBal() + 2);
    }
    public void move5TilesChance(Player playerObj) {
        playerObj.setTilePosition(playerObj.getTilePosition()+5);
    }
    public void moveToOrangeFieldChance(Player playerObj) {
        playerObj.setTilePosition(7);
    }
    public void ateCandyChance(Player playerObj) {
        playerObj.setBal(playerObj.getBal()-2);
    }
    public void moveToLightBlueFieldChance(Player playerObj) {playerObj.setTilePosition(4); }
    public void outOfJailChance(Player playerObj) {playerObj.setJailFreeCard(true); }
    public void moveToStrandpromenaden(Player playerObj) {playerObj.setTilePosition(23); }
    public void doneHomeworkChance(Player playerObj) { playerObj.setBal(playerObj.getBal()+2); }
    public void moveToRedFieldChance(Player playerObj) {playerObj.setTilePosition(13); }
    public void moveToSkaterparkenChance(Player playerObj) {playerObj.setTilePosition(10);}
}
