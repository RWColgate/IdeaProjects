package pl.sda;

import java.util.Random;
import java.util.Scanner;

public class random {

    /*
     *** Zaimplementuj grę w kółko i krzyżyk na planszy 3x3 użyj tablic dwuwymiarowych.
     * Pozwól użytkownikowi wybrać czy gra kółkiem czy krzyżykiem, dla uproszczenia wybór
     * pola dokonaj poprzez pobranie pojedynczej liczby, tak jak pokazane na obrazku niżej.
     * Po każdym wyborze wyświetl zaktualizowaną planszę gry.
     *   0   1   2
     *   3   4   5
     *   6   7   8
     */
     /*  -----------
        | 1 | 2 | 3 |
        |---+---+---|
        | 4 | 5 | 6 |
        |---+---+---|
        | 7 | 8 | 9 |
         -----------
     */

    public static void main(String[] args) {
        // user wybiera czym gra
        char znakUzytkownika = wybierzZnak();
        char znakKompa = przypiszZnakKompowi(znakUzytkownika);

        // losujemy kto pierwszy
        int kolejnosc = losujKolejnoscGraczy();
        narysujKolejnoscPol();

        // zaczynamy gre
        graj(kolejnosc, znakUzytkownika, znakKompa);
    }

    private static void narysujKolejnoscPol() {
        System.out.println("Numery pól które będziesz wybierać:");
        int licznik = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf(licznik + "\t");
                licznik++;
            }
            System.out.println();
        }
    }

    private static int losujKolejnoscGraczy() {
        // jeśli 0 - user pierwszy, 1 user 2
        Random random = new Random();
        int kolejnosc = random.nextInt(2);
        System.out.println("Losuję kolejność graczy ...");
        String kto = (kolejnosc==0) ? "TY" : "Komputer";
        System.out.println("Pierwszy będzie grał: " + kto);

        return kolejnosc;
    }

    private static void graj(int kolejnosc, char znakUzytkownika, char znakKompa) {
        // pierwszy ruch (zależy od kolejnosc!!!
        char[][] tabela = new char[3][3];
        boolean graWygrana = false; //true jesli wygrana
        int pozycja = 0;
        for (int i = 0; i < 9; i++) {
            if (kolejnosc == 0){
                pozycja = podajPozycje();
                tabela = zapiszDoTabeli(pozycja, tabela, znakUzytkownika);
                narysujTabele(tabela, i);
                kolejnosc = 1;
                graWygrana = sprawdzKtoWygral(tabela);
                if (graWygrana) {
                    System.out.println("Grę wygrałeś TY - Brawo!!!");
                    break;
                }
                continue;
            }
            if (kolejnosc == 1){
                pozycja = losujPozycje(tabela);
                tabela = zapiszDoTabeli(pozycja, tabela, znakKompa);
                narysujTabele(tabela, i);
                kolejnosc = 0;
                graWygrana = sprawdzKtoWygral(tabela);
                if (graWygrana) {
                    System.out.println("Grę wygrał KOMPUTER - Spróbuj jeszcze raz!!!");
                    break;
                }
                continue;
            }
        }
    }

    private static boolean sprawdzKtoWygral(char tab[][]) {
        boolean graWygrana = false;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i][0]==tab[i][1] && tab[i][1]==tab[i][2] && (int)tab[i][0]!=0) {
                graWygrana = true;
                return graWygrana;
            }
        }
        for (int i = 0; i < tab.length; i++) {
            if (tab[0][i]==tab[1][i] && tab[1][i]==tab[2][i] && (int)tab[0][i]!=0) {
                graWygrana = true;
                return graWygrana;
            }
        }
        if (tab[0][0]==tab[1][1] && tab[1][1]==tab[2][2] && (int)tab[1][1]!=0) {
            graWygrana = true;
            return graWygrana;
        }
        if (tab[0][2]==tab[1][1] && tab[1][1]==tab[2][0] && (int)tab[1][1]!=0) {
            graWygrana = true;
            return graWygrana;
        }
        return graWygrana;
    }

    private static int losujPozycje(char[][] tabela) {
        Random random = new Random();
        int pozycja = 0;
        boolean pozycjaZajeta = false;
        do {
            pozycja = random.nextInt(9);
            pozycjaZajeta = sprawdzTabele(pozycja, tabela);

        } while (pozycjaZajeta);
        return pozycja;
    }

    private static boolean sprawdzTabele(int pozycja, char[][] tabela) {
        boolean pozycjaZajeta = false;
        switch (pozycja) {
            case 0: if ((int)tabela[0][0] != 0) {pozycjaZajeta=true;}
                break;
            case 1: if ((int)tabela[0][1] != 0) {pozycjaZajeta=true;}
                break;
            case 2: if ((int)tabela[0][2] != 0) {pozycjaZajeta=true;}
                break;
            case 3: if ((int)tabela[1][0] != 0) {pozycjaZajeta=true;}
                break;
            case 4: if ((int)tabela[1][1] != 0) {pozycjaZajeta=true;}
                break;
            case 5: if ((int)tabela[1][2] != 0) {pozycjaZajeta=true;}
                break;
            case 6: if ((int)tabela[2][0] != 0) {pozycjaZajeta=true;}
                break;
            case 7: if ((int)tabela[2][1] != 0) {pozycjaZajeta=true;}
                break;
            case 8: if ((int)tabela[2][2] != 0) {pozycjaZajeta=true;}
                break;
        }
        return pozycjaZajeta;
    }

    private static void narysujTabele(char[][] tabela, int ruch) {
        narysujKolejnoscPol();
        System.out.println("Stan gry po " + (ruch+1) + "-m ruchu");
        for (int i = 0; i < tabela.length; i++) {
            for (int j = 0; j < tabela.length; j++) {
                System.out.printf(tabela[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static char[][] zapiszDoTabeli(int pozycja, char[][] tab, char znak) {
        switch (pozycja) {
            case 0:
                tab[0][0] = znak;
                break;
            case 1:
                tab[0][1] = znak;
                break;
            case 2:
                tab[0][2] = znak;
                break;
            case 3:
                tab[1][0] = znak;
                break;
            case 4:
                tab[1][1] = znak;
                break;
            case 5:
                tab[1][2] = znak;
                break;
            case 6:
                tab[2][0] = znak;
                break;
            case 7:
                tab[2][1] = znak;
                break;
            case 8:
                tab[2][2] = znak;
                break;
        }
        return tab;
    }


    private static int podajPozycje() {
        int pozycja = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj w którym polu chcesz postawić Twój znak: ");
        pozycja = scanner.nextInt();
        System.out.println("Wybrałeś pole: " + pozycja);
        return pozycja;
    }

    private static char przypiszZnakKompowi(char znakUzytkownika) {
        char znakKompa = '\0';
        if (znakUzytkownika == 'o') {
            znakKompa = 'x';
        } else {
            znakKompa = 'o';
        }

        return znakKompa;
    }

    private static char wybierzZnak() {
        char znak = '\0';
        System.out.println("Masz do wyboru 'o' lub 'x' - co wybierasz (wpisz o lub x:");
        do {
            Scanner scanner = new Scanner(System.in);
            znak = scanner.nextLine().charAt(0);
            System.out.println("Wybrałeś: " + znak);
            if (!(znak == 'o' || znak == 'x')) {
                System.out.println("Coś poszło nie tak, spróbuj jeszcze raz wybrać znak 'x' lub 'o':");
            }
        } while (!(znak == 'x' || znak == 'o'));
        return znak;
    }
}