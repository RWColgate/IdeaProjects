//Zadanie7
//spammer
package pl.sda.zadania;

import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String slowo = null;
        int ileRazy = 0;
        metodaSpammer(slowo,ileRazy);

    }

    private static void metodaSpammer(String slowo, int ileRazy) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jakie slowo chcesz powtarzac?");
        slowo = scanner.nextLine();
        System.out.println("Ile razy chcesz powtorzyc?");
        ileRazy = scanner.nextInt();
        int i=0;
        do {
            System.out.println(slowo);
            i++;
        }while(i<ileRazy);

    }
}
//1