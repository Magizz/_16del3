package Controller;

import main.Dice;
import main.Player;

public class GameController {

    private Dice d = new Dice();
    private UIController ui = new UIController();
    Player[] playerArray = new Player[4];
    private boolean gameover = false;
    private int totalPlayers = 0;


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
            ui.setDice(dice);
            ui.showMessage("du slog " + dice);
            player.setTilePosition(player.getTilePosition()+dice);
            ui.movePlayer(player,playerID);
    }

    public void startGame(){
        totalPlayers = ui.getPlayerNumber();
        for (int i = 0; i < totalPlayers ; i++) {
            playerArray[i].startBal(totalPlayers);
            ui.addPlayer(playerArray[i].getBal());
        }
    }

    public void gameLoop(){
        for (int i = 0; i < totalPlayers ; i++) { playerTurn(playerArray[i],i); }

    }
}
