package Controller;

import gui_fields.GUI_Player;
import main.*;
import Tiles.*;


public class MainController {
    private UIController ui = new UIController();
    private Board boardObj = new Board();
    private Dice dieObj = new Dice();
    private int die = dieObj.dieHit();
    private boolean gameover = false;
    private Tile[] board;
    private GUI_Player[] guiPlayersObjArray;
    private Player[] playersObjArray;


    public void setInformation() {
        guiPlayersObjArray = ui.getGUIPlayerObjArray();
        playersObjArray = ui.getPlayersArray();
        board = boardObj.getBoard();
    }
    public void runTest() {
        ui.startGame();
        ui.GUISetDice(die);
        setInformation();
        while (!gameover) {
            for (int i = 0; i < ui.getTotalPlayers(); i++)
            ui.playerTurn(playersObjArray[i], guiPlayersObjArray[i], playersObjArray );
        }
    }
    public void Game() {runTest();}

}
