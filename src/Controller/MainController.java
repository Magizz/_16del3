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
        playersObjArray = new Player[ui.getTotalPlayers()];
        playersObjArray = ui.setPlayerInformation(playersObjArray);
        board = boardObj.getBoardTiles();
    }
    public void runTest() {
        ui.startGame();
        ui.GUISetDice(die);
        setInformation();
        while (!gameover) {
            for (int i = 0; i < ui.getTotalPlayers(); i++)
            ui.playerTurn(playersObjArray[i], guiPlayersObjArray[i] );
        }
    }
    public void Game() {runTest();}

}
