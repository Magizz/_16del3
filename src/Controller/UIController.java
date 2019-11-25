package Controller;
import gui_fields.*;
import gui_main.GUI;
import main.Bank;
import main.Dice;
import java.awt.*;

public class UIController {
    private GUI_Player[] playerObjArray = new GUI_Player[4];;
    private Dice dieObj = new Dice();
    private Bank bankObj;
    private GUI_Field[] fields = new GUI_Field[24];
    private GUI gui;
    private int totalPlayers = 0;


    public UIController() {
        gui = new GUI(createBoard());
    }

    public void GUISetDice (int roll) { gui.setDie(roll); }

    private GUI_Field[] createBoard() {
        fields[0] = new GUI_Start("Start", "Modtag: 2", "Modtag kr. 2,-\nnår de passerer start", Color.RED, Color.BLACK);
        fields[1] = new GUI_Street("Burgerbaren", "Pris:  1", "Burgerbaren", "Leje:  1", new Color(102, 102, 0), Color.BLACK);
        fields[2] = new GUI_Street("Pizzeriaet", "Pris:  1", "Pizzeriaet", "Leje:  1", new Color(102, 102, 0), Color.BLACK);
        fields[3] = new GUI_Chance("?", "Prøv lykken", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
        fields[4] = new GUI_Street("Slikbutikken", "Pris:  1", "Slikbutikken", "Leje:  1", new Color(102, 178, 255), Color.BLACK);
        fields[5] = new GUI_Street("Iskiosken", "Pris:  1", "Iskiosken", "Leje:  1", new Color(102, 178, 255), Color.BLACK);
        fields[6] = new GUI_Jail("default", "Fængsel", "Fængsel", "På besøg i fængslet", new Color(125, 125, 125), Color.BLACK);
        fields[7] = new GUI_Street("Musseet", "Pris:  2", "Musseet", "Leje:  2", new Color(255, 102, 102), Color.BLACK);
        fields[8] = new GUI_Street("Biblioteket", "Pris:  2", "Biblioteket", "Leje:  2", new Color(255, 102, 102), Color.BLACK);
        fields[9] = new GUI_Chance("?", "PrÃ¸v lykken", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
        fields[10] = new GUI_Street("Skaterparken", "Pris:  2", "Skaterparken", "Leje:  2", new Color(255, 255, 102), Color.BLACK);
        fields[11] = new GUI_Street("Swimmingpoolen", "Pris:  2", "Swimmingpoolen", "Leje:  2", new Color(255, 255, 102), Color.BLACK);
        fields[12] = new GUI_Refuge("default", "Helle", "Helle", "Ta' en pause min ven", Color.WHITE, Color.BLACK);
        fields[13] = new GUI_Street("Spillehallen", "Pris:  3", "Spillehallen", "Leje:  3", new Color(255, 0, 0), Color.BLACK);
        fields[14] = new GUI_Street("Biografen", "Pris:  3", "Biografen", "Leje:  3", new Color(255, 0, 0), Color.BLACK);
        fields[15] = new GUI_Chance("?", "Prøv lykken", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
        fields[16] = new GUI_Street("Legetøjsbutikken", "Pris:  3", "Legetøjsbutikken", "Leje:  3", new Color(0, 255, 0), Color.BLACK);
        fields[17] = new GUI_Street("Dyrehandlen", "Pris:  3", "Dyrehandlen", "Leje:  3", new Color(0, 255, 0), Color.BLACK);
        fields[18] = new GUI_Jail("default", "Gå i fængsel", "Gå i fængsel", "De fængsles\nSlå to ens for at komme ud", new Color(125, 125, 125), Color.BLACK);
        fields[19] = new GUI_Street("Bowlinghallen", "Pris:  4", "Bowlinghallen", "Leje:  4", new Color(0, 120, 0), Color.BLACK);
        fields[20] = new GUI_Street("Zoo", "Pris:  4", "Zoo", "Leje:  4", new Color(0, 120, 0), Color.BLACK);
        fields[21] = new GUI_Chance("?", "Prøv lykken", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
        fields[22] = new GUI_Street("Vandlandet", "Pris:  5", "Vandlandet", "Leje:  5", new Color(0, 0, 102), Color.BLACK);
        fields[23] = new GUI_Street("Strandpromenaden", "Pris:  5", "Strandpromenaden", "Leje:  5", new Color(0, 0, 102), Color.BLACK);
        return fields;
    }

    public void GUIField(){
        gui = new GUI(createBoard());
    }

    public int getSetPlayerNumber() {
        totalPlayers = Integer.parseInt(gui.getUserSelection("Hvor mange spillere er i?","2","3","4"));
        return totalPlayers;
    }

    public int getTotalPlayers() {
        return totalPlayers;
    }

    public GUI_Player[] getPlayerObjArray() {
        return playerObjArray;
    }

    public String setNameUI() {
        String name = null;
        name = gui.getUserString( "hvad er dit navn?");
        return name;
    }

    public void showMessage(String text) {
        gui.showMessage("" + text);
    }

    public void addGUIPlayer (int bal) {
        for (int i = 0; i < totalPlayers ; i++) {
            playerObjArray[i] = new GUI_Player(setNameUI(), bal);
            gui.addPlayer(playerObjArray[i]);
            gui.getFields()[0].setCar(playerObjArray[i],true);
            System.out.println(playerObjArray[i]);
        }
    }

    public void setDice (int roll) { gui.setDie(roll); }

    public void movePlayer (int newPos, GUI_Player player) {
        for (int i = 0; i <fields.length ; i++) {
            if ( fields[i]!=null )
                fields[i].setCar(player,false);
        }
        gui.getFields()[newPos].setCar(player,true);
    }

    public int startBal(int spiller){
        if (spiller == 2) { return 20; }
        else if (spiller == 3){ return 18; }
        else { return 16; }
    }

    public void startGame() {
        this.totalPlayers = getSetPlayerNumber();
        System.out.println(totalPlayers);
        int bal = startBal(totalPlayers);
        addGUIPlayer(bal);
    }

    public void playerTurn(GUI_Player GUIplayerObj) {
        int die = this.dieObj.dieHit();
        GUISetDice(die);
        showMessage("Du slog: " + die);
        movePlayer(die, GUIplayerObj);
    }



}













