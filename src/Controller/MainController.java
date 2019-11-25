package Controller;

import gui_fields.GUI_Player;
import main.Dice;


public class MainController {
        UIController ui = new UIController();
        Dice dieObj = new Dice();
        private int die = dieObj.dieHit();
    public void runTest() {
        ui.startGame();
        ui.GUISetDice(die);
        GUI_Player[] playersArray = ui.getPlayerObjArray();
        ui.playerTurn(playersArray[0]);
    }

}
