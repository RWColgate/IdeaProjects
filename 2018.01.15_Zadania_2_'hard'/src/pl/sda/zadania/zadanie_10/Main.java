package pl.sda.zadania.zadanie_10;

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Aplikacja gry w statki");
        Field field = new Field(10,10);
        boolean isWorking = true;
        do{
            System.out.println("Podaj komende: ");
            String command = sc.next().trim().toLowerCase();
            String[] words = command.split(" ");
            String coRobic = words[0];
            if(("quit").equals(coRobic)){
                break;
            } else if(("print").equals(coRobic)){
                field.printField(3,2);
            }

        }while(isWorking);
    }
}
