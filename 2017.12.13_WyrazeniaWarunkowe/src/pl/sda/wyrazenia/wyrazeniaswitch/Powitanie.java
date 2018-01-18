package pl.sda.wyrazenia.wyrazeniaswitch;

import java.util.Scanner;

public class Powitanie {
    public static void main(String[] args) {
        String imie;

        Scanner scanner = new Scanner(System.in);
        imie = scanner.nextLine();

        switch (imie) {
            case "Ania":
                System.out.println("Czesc Ania, kope lat");
                break;
            case "Andrzej":
                System.out.println("Czesc Andrzej, gdzie sa moje...?");
                break;

            default:
                System.out.println("Czesc " + imie + " milo mi cie poznac.");
                break;
        }
    }
}