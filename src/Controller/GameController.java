package Controller;

import main.Dice;

public class GameController {
    public static void gameloop() {

    }
    public static void passStart(main.Player p) {
        int newbal = p.getBal();
        newbal += 2;
        p.setBal(newbal);
        }

    public static void newPosition(main.Player p,main.Dice d) {
        int newPos = p.getTilePosition();
        newPos += d.dieHit();
        p.setTilePosition(newPos);
    }

}
