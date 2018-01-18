package pl.sda.petle.petlafor;

import java.util.Scanner;

public class DrukujLiczbyParzyste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();

        for (int i=0; i<liczba; i++){
            if(i%2!=0)continue;
            else System.out.println(i);

        }
    }
}
