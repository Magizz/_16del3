package Controller;

import gui_fields.*;
import gui_main.GUI;
import jdk.nashorn.internal.ir.ReturnNode;
import main.Dice;
import main.Player;
import java.awt.*;

public class UIController{
    private Dice di = new Dice();
    private GUI gui;

    public void showMessage(String text) {
        gui.showMessage("" + text);
    }
}













