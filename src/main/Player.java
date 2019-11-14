package main;

public class Player {

     private String name;
     private int bal;
     private int age;
     private int tilePosition;

    public Player () {
        name = "";
        bal = 0;
        age = 0;
        tilePosition = 0;
    }

    //Accessor
    public String getName() { return name; }
    public int getBal() { return bal; }
    public int getAge() { return age; }
    public int getTilePosition() { return tilePosition; }

    //Mutator
    public void setTilePosition( int tp ) { tilePosition = tp; }
    public void setName(String n) { name = n; }

    public void players (int antalSpillere) {

         if ( antalSpillere == 2){
            Player player1 = new Player();
            Player player2 = new Player();
         }
         else if ( antalSpillere == 3) {
             Player player1 = new Player();
             Player player2 = new Player();
             Player player3 = new Player();
         }
         else {
             Player player1 = new Player();
             Player player2 = new Player();
             Player player3 = new Player();
             Player player4 = new Player();
         }

    }

}