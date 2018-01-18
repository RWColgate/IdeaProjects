package pl.sda;

import java.util.Random;
import java.util.Scanner;

public class losowanie {
    static int odLosuj;
    static int doLosuj;
    static int losowanie;
    public static void main(String[] args) {
        losujLiczbe();
    }

    private static void losujLiczbe() {
        Random r = new Random();
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj od jakiej liczby chcesz losowac: ");
//        odLosuj = scanner.nextInt();
//        System.out.println("Do jakiej liczby losowac: ");
//        doLosuj = scanner.nextInt();

        losowanie = r.nextInt(430-250)+250;
        System.out.println(losowanie);
    }
}
