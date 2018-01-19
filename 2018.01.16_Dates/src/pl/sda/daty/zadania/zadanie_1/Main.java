package pl.sda.daty.zadania.zadanie_1;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate localDate = LocalDate.now();
        boolean isWorking = true;
        do {
            System.out.println("Podaj komende.");
            String command = sc.nextLine();
            String[] words = command.split(" ");
            if (words[0].equals("")){
                System.out.println(localDate);
            }else if ("quit".equals(words[0])) {
                break;
            }
        } while (isWorking);
    }
}
