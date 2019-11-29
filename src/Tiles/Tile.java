package Tiles;

import main.Player;

public abstract class Tile {

    protected int tileID;
    protected String tileText;


    public int getTileID() { return tileID; }
    public abstract void landOnField(Player playerObj);

}
