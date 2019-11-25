package Controller;

import main.Dice;
import main.Player;

public class GameController {

    private Dice d;
    private boolean gameover = false;

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



}
