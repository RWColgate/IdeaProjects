//Zadanie9
package pl.sda;

public class Zad9 {
    public static void main(String[] args) {
        int ile = 0;
        for (int setna = 1; setna < 5; setna++) {
            for (int dziesiatek = 1; dziesiatek < 5; dziesiatek++) {
                for (int jednosci = 1; jednosci < 5; jednosci++) {
                    if (jednosci != dziesiatek && dziesiatek != setna && setna != jednosci) {
                        System.out.printf("%d%d%d\n ",setna,jednosci,dziesiatek);
                        ile++;
                    }
                }
            }
        }
        System.out.println("ile: "+ile);

    }
}
//1