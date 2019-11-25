package GUI;

import gui_fields.*;
import gui_main.GUI;
import main.Player;
import java.util.ArrayList;

import java.util.ArrayList;

public class GUI_Players {


    private GUI_Player[] GUIplayers = new GUI_Player[getTotalPlayers()];
    private GUI gui;
    private String GUIname;
    private int GUIbal;


    public GUI_Players(String name, int bal) {
        GUIname = name;
        GUIbal = bal;
    }

    public void addGUIPlayer(String name,int bal) {
        for (int i = 0; i < totalPlayers; i++) {
            name = setNameUI();
            gui.addPlayer(GUIplayers[i]);
            gui.getFields()[0].setCar(GUIplayers[i], true);
        }
    }
    public void movePlayer (Player player,int playerID) {
        for (int i = 0; i < GUI_Fields.fields.length; i++) {
           GUI_Fields.fields[i].setCar(GUIplayers[playerID], false);
            gui.getFields()[player.getTilePosition()].setCar(GUIplayers[playerID], true);
        }
    }

    public String setNameUI () {
            String name = null;
            name = gui.getUserString("hvad er dit navn?");
            return name;
    }


}