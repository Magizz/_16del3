public class MainController {
    UIController UI = new UIController();
    Player pl = new Player();



public void game() {
    int antalSpiller = UI.getPlayerNumber();
    String name = UI.setNameUI();
    pl.players(name, antalSpiller);
    }
}
