package Controller;

import main.Player;

public class MainController {
    UIController UI = new UIController();
    Player pl = new Player();



public void game() {
    int antalSpiller = UI.getPlayerNumber();
    pl.players(antalSpiller);
    }
}
