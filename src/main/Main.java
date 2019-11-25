package main;

import Controller.GameController;
import Controller.UIController;

public class Main {


    public static void main(String[] args) {
       GameController game = new GameController();
       game.startGame();
       game.gameLoop();
        //UIController UI = new UIController();

        //MainController main = new MainController();



    }

}
