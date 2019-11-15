package main;

import Controller.UIController;

public class Main {

    public static void main(String[] args) {
        Player myPlayer1 = new Player();
        myPlayer1.setName("Stefan");
        myPlayer1.setAge(20);
        myPlayer1.setBal(18);
        System.out.println(myPlayer1);
        Player myPlayer2 = new Player("Niko", 20);
        myPlayer2.setBal(20);
        System.out.println(myPlayer2);


    }
   // MainController main = new MainController();
   // public static void main(String[] args) { main.game(); }
}
