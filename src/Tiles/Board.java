package Tiles;

public class Board {
    public Board() {};

    public Tile[] boardTiles() {
        Tile[] board = new Tile[24];
        board[0] = new Start(0);
        board[1] = new Property("Burgerbaren", 1, 1, 1 );
        board[2] = new Property("Pizzariaet", 1, 1, 2 );
        board[3] = new Chance(3);
        board[4] = new Property("Slikbutikken", 1, 1, 4 );
        board[5] = new Property("Iskiosken", 1, 1, 5 );
        board[6] = new Jail(6); // Besøg
        board[7] = new Property("Museet", 2, 2, 7 );
        board[8] = new Property("Biblioteket", 2, 2, 8 );
        board[9] = new Chance(9);
        board[10] = new Property("Skaterparken", 2, 2, 10 );
        board[11] = new Property("Swimminpoolen", 2, 2, 11 );
        board[12] = new Parking(12);
        board[13] = new Property("Spillehallen", 3, 3, 13 );
        board[14] = new Property("Biografen", 3, 3, 14 );
        board[15] = new Chance(15);
        board[16] = new Property("Lejetøjsbutikken", 3, 3, 16 );
        board[17] = new Property("Dyrehandlen", 3, 3, 17 );
        board[18] = new Jail(18); // I fængsel
        board[19] = new Property("Bowlinghallen", 4, 4, 19 );
        board[20] = new Property("Zoo", 4, 4, 20 );
        board[21] = new Chance(21);
        board[22] = new Property("Vandlandet", 5, 5, 22 );
        board[23] = new Property("Strandpromenaden", 5, 5, 23 );
        return board;
    }


}
