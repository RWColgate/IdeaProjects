package pl.sda.zadania.zadanie_4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Aplikacja kalkulatora.");
        Kalkulator kalkulator = new Kalkulator();
        boolean isWorking = true;
        do {
            System.out.println("Podaj komende");
            String command = sc.next().trim().toLowerCase();

//            String[] words = command.split(" ");

            double liczba1 = sc.nextDouble();
            double liczba2 = sc.nextDouble();
            if (command.equals("add")) {
                System.out.println(kalkulator.addTwoNumbers(liczba1, liczba2));
            } else if (command.equals("subtrace")) {
                System.out.println(kalkulator.subtractTwoNumbers(liczba1, liczba2));
            } else if (command.equals("divide")) {
                System.out.println(kalkulator.divideTwoNumbers(liczba1, liczba2));
            } else if (command.equals("multiply")) {
                System.out.println(kalkulator.multiplyTwoNumbers(liczba1, liczba2));
            } else if (command.equals("quit")) {
                break;
            }else if (command.equals(27)){
                break;
            }

        } while (isWorking);
    }
}
