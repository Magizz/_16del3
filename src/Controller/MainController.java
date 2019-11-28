package Controller;

import gui_fields.GUI_Player;
import main.Dice;
import main.Player;


public class MainController {
        UIController ui = new UIController();
        Dice dieObj = new Dice();
        private int die = dieObj.dieHit();
        private boolean gameover = false;
    public void runTest() {
        ui.startGame();
        ui.GUISetDice(die);
        GUI_Player[] guiPlayersObjArray = ui.getGUIPlayerObjArray();
        Player[] playersObjArray = new Player[ui.getTotalPlayers()];
        playersObjArray = ui.setPlayerInformation(playersObjArray);
        while (!gameover) {
            for (int i = 0; i < ui.getTotalPlayers(); i++)
            ui.playerTurn(playersObjArray[i], guiPlayersObjArray[i] );
        }
    }

}
