package pl.sda.tablice;

public class Zadanie {
    public static void main(String[] args) {
        int[] liczby = new int[]{1, 3, 5, 10};

        System.out.println("Wypisanie tablicy w petli");
        for (int i = 0; i < liczby.length; i++) {
            System.out.print(liczby[i] + " ");
        }

        System.out.println("\nWypisuje tylko liczby o parzystym indeksie");
        for (int i = 0; i < liczby.length; i++) {
            if (i % 2 == 0) System.out.print(liczby[i] + " ");
        }

        System.out.println("\nWypisuje tylko parzyste liczby");
        for (int i = 0; i < liczby.length; i++) {
            if (liczby[i] % 2 == 0) System.out.print(liczby[i] + " ");
        }

        System.out.println("\nWypisuje tablice na odwrot");
        for (int i = liczby.length - 1; i >= 0; i--) {
            System.out.print(liczby[i] + " ");
        }
    }
}
