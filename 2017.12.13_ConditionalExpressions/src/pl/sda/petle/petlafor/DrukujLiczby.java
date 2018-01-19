package pl.sda.petle.petlafor;

import java.util.Scanner;

public class DrukujLiczby {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczbaMax = scanner.nextInt();
        for(int i=0; i<liczbaMax; i++){
            System.out.println(i);
        }
    }
}
