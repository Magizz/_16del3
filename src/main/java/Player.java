import java.util.Scanner;

public class Player {

    public static String[] startGame(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Velkommen til spillet, hvor mange spillere er i?");
        int antalSpilere = scan.nextInt();
        String[] names = new String[antalSpilere];
        for (int i = 0; i < antalSpilere; i++) {
            System.out.println(" Fedt! Spiller " + (i + 1) + ", hvad er dit navn");
            names[i] = scan.nextLine();
            System.out.println("Hej " + names[i] + "!");
            System.out.println("------------------------------------------------");
        }
        System.out.println("Lad spillet begynde!");
        System.out.println("Alle spillere starter med en balance på 1000");
        System.out.println("------------------------------------------------");
        return names;
    }
}