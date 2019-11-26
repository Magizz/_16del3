
package Tiles;
import main.Player;

import java.util.ArrayList;


public class Chance extends Tile{
    private static ArrayList<Chance> chancer = new ArrayList<Chance>();
    private Runnable action;
    private String description;

    // Konstruktør der beskriver chancekortet
    private Chance(String description, Runnable action) {
        this.action = action;
        this.description = description;
    }


    //Denne metode returnere chancekortets beskrivelser
    public String getDescription() {
        return description;
    }

    //Her tilføjes beskrivelsens og dens action/konsekvenser til kortet
    private static void tilføjChance(String description, Runnable action) {
        chancer.add(new Chance(description, action));
    }

    // Metoden her gør at der trækkes det næste kort der er i bunken.
    public static Chance getNextChance() {
        Chance chance = chancer.get(0);
        chancer.remove(0);
        chancer.add(chance);
        return chance;
    }

    //Her oprettes kortene.
    public static void opretChancerKort() {
        String chanceDescription = "CHANCE: Du rykker frem til start og modtager M2!";
        Runnable chance_run = new Runnable() {
            public void run() {
                Player.rykPåBrik(Tur.getcurrentPlayer(), 0);
                Tur.getcurrentPlayer().setBal(2);
            }
        };
        tilføjChance(chanceDescription, chance_run);

        chanceDescription = "CHANCE: Ryk 5 felter frem!";
        chance_run = new Runnable() {
            public void run() {
                if (Tur.getcurrentPlayer().getTile() == 21){
                    Player.rykPåBrik(Tur.getcurrentPlayer(),2);
                }
                else
                    Player.rykPåBrik(Tur.getcurrentPlayer(),Tur.getcurrentPlayer().getTileposition()+5 );
            }
        };
        tilføjChance(chanceDescription, chance_run);

        chanceDescription = "CHANCE: Ryk 1 felt frem, eller tag et chancekort mere.";
        chancerun = new Runnable() {
            public void run() {
                boolean valg = Player.getTi().getUserLeftButtonPressed("Vil du rykke 1 felt frem eller tag et nyt chance kort?", "1 felt frem", "Nyt kort");
                if (valg) {
                    Player.rykPåBrik(Tur.getcurrentPlayer(), Tur.getcurrentPlayer().getTileposition() +1);
                } else {
                    Chance chance =  getNextChance()Chance();
                    Player.get().showMessage(chance.getDescription());
                    chance.kør();
                }
            }
        };
        tilføjChance(chanceDescription, chance_run);

        chanceDescription = "CHANCE: Du har spist for meget slik. Betal M2 til banken!";
        chance_run = new Runnable() {
            public void run() {
                Tur.getcurrentPlayer().setBal(-2);
            }
        };
        tilføjChance(
                chanceDescription, chance_run);

        chanceDescription = "CHANCE: Ryk frem til Strandpromenaden!";
        chance_run = new Runnable() {
            public void run() {
                Board.rykPåBrik(Tur.getcurrentPlayer(), 23);
            }
        };
        tilføjChance(
                chanceDescription, chance_run);

        chanceDescription = "CHANCE: Det er din fødselsdag! Alle giver dig M1!";
        chancek_run = new Runnable() {
            public void run() {
                for(Player Player: Tur.getPlayers()) {
                    Player.setBal(-1);
                    Tur.getcurrentPlayer().setBal(1);
                }
            }
        };
        tilføjChance(
                chanceDescription, chance_run);

        chanceDescription = "CHANCE: Du har lavet alle dine lektier! Modag M2 fra banken!";
        chance_run = new Runnable() {
            public void run() {
                Tur.getcurrentPlayer().setBal(2);
            }
        };
        tilføjChance(
                chanceDescription, chance_run);

        chanceDescription = "CHANCE: Du løslades uden omkostninger. Behold dette kort, indtil du får brug for det!";
        chance_run = new Runnable() {
            public void run() {
                Tur.getcurrentPlayer().setPlayerHarFængselsKortet(true);
            }
        };

        tilføjChance(
                chanceDescription, chance_run);



        chanceDescription = "CHANCE: Ryk frem til Skaterparken for at lave det perfekte grind! Hvis ingen ejer den får du den GRATIS! Ellers skal du BETALE leje til ejeren!";
        chance_run = new Runnable() {
            public void run() {
                Board.rykPåBrik(Tur.getcurrentPlayer(), 10, true);

            }

        };
        tilføjChance(
                chanceDescription, chance_run);

        Collections.shuffle(chancer);
    }

}
