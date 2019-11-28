package Controller;

import gui_fields.GUI_Player;
import main.Dice;
import main.Player;

public class GameController {

    private Dice d;
    private boolean gameover = false;

    public void passStart(GUI_Player GUIplayerObj) {
        GUIplayerObj.setBalance(GUIplayerObj.getBalance()+2);
        }





}
