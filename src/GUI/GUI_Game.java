package GUI;

public class GUI_Game {
    public void setTotalPlayers () {
        totalPlayers = Integer.parseInt(gui.getUserSelection("Hvor mange spillere er i?", "2", "3", "4"));
    }
    public int getTotalPlayers () { return totalPlayers; }
}
