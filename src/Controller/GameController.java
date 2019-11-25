package Controller;

import GUI.GUI_Dice;
import GUI.GUI_Players;
import main.Dice;
import main.Player;

public class GameController {

    private Dice d;
    private GUI_Players GUIPlayer;
    private GUI_Dice gd;
    private UIController ui = new UIController();
    private boolean gameover = false;
    private int totalPlayers = 0;
    private Player[] playerArray = new Player[4];

    public static void passStart(main.Player p) {
        int newbal = p.getBal();
        newbal += 2;
        p.setBal(newbal);
        }

    public static void newPosition(main.Player p,main.Dice d) {
        int newPos = p.getTilePosition();
        newPos += d.dieHit();
            if (newPos > 23) {
                newPos -= 24;
            }
        p.setTilePosition(newPos);
    }

    public void playerTurn(Player player, int playerID) {
            int dice = d.dieHit();
            gd.GUISetDice(dice);
            ui.showMessage("du slog " + dice);
            player.setTilePosition(player.getTilePosition()+dice);
            pl.movePlayer(player,playerID);
    }

    public void startGame(){
        GUIPlayer.setTotalPlayers();
        totalPlayers = GUIPlayer.getTotalPlayers();
        for (int i = 0; i < totalPlayers ; i++) {
            playerArray[i].startBal(totalPlayers);
            GUIPlayer.addGUIPlayer(playerArray[i].getName(),playerArray[i].getBal());
        }
    }

    public void gameLoop(){
        for (int i = 0; i < totalPlayers ; i++) { playerTurn(playerArray[i],i); }

    }

}
