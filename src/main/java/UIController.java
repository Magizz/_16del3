import gui_fields.GUI_Field;
import gui_main.GUI;
import jdk.nashorn.internal.ir.ReturnNode;

public class UIController {
        GUI_Field[] fields = new GUI_Field[24];
        GUI gui = new GUI(fields);
        int antalSpillere = 0;

    public int getPlayerNumber() {
        antalSpillere = gui.getUserInteger("Hvor mange spillere er i? et tal mellem 2-4", 2, 4);
        return antalSpillere;
    }
    public String[] getPlayerName() {
         String[] name={};
            for (int i = 0; i < antalSpillere ; i++) {
                 name[i] = gui.getUserString("Spiller " + (i+1) + " hvad er dit navn?");
            }
            return name;
    }
}
