package main;

import Controller.GameController;
import Controller.UIController;
import main.Dice;
import main.Player;

class Test {
    UIController ui = new UIController();
    Player pl = new Player();
    Dice d = new Dice();
    private boolean gameover = false;

    void mainTest() {}}

       /* int antalspillere = ui.getPlayerNumber();
        pl.startBal(antalspillere);
        pl.players(antalspillere);
        ui.addPlayer(pl.getBal());
        }


    public void gameLoop(Player player) {
        while (!gameover)
            ui.setDice(d.dieHit());
            ui.showMessage("du slog " + d.dieHit());
            ui.movePlayer(player.getTilePosition(),player.getName(),player.getBal());
    }

}
       /* Player myPlayer1 = new Player();
        Dice diceobj = new Dice();
        myPlayer1.setName("Stefan");
        myPlayer1.setAge(20);
        myPlayer1.setBal(18);
        myPlayer1.setTilePosition(0);
        GameController.passStart(myPlayer1);
        Player myPlayer2 = new Player("Niko", 20);
        myPlayer2.setBal(20);


        for (int i = 0; i < 10 ; i++) {
            GameController.newPosition(myPlayer1, diceobj);
            GameController.newPosition(myPlayer2, diceobj);
            System.out.println(myPlayer1);
            System.out.println(myPlayer2);
        }
        System.out.println(myPlayer1);
        System.out.println(myPlayer2); */




