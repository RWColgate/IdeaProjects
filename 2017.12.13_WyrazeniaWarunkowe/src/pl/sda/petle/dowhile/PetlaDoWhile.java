package pl.sda.petle.dowhile;

import java.util.Scanner;

public class PetlaDoWhile {
    public static void main(String[] args) {
        do {
            System.out.println("Strzal!");
        }while(false);

//        int i=0;
//        do {
//            i++;
//            System.out.println(i);
//
//        }while(i<=100);


        int powtorzenia = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            powtorzenia = scanner.nextInt();
            for (int j=0; j<powtorzenia; j++){
                System.out.println("Spam!");
            }
        }while(powtorzenia!=0);

        System.out.println("aaa");
    }

}
