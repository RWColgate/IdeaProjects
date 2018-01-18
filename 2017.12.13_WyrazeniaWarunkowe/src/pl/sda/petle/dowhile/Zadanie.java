package pl.sda.petle.dowhile;


import java.util.Scanner;

public class Zadanie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczba =0;
        do {
            liczba = scanner.nextInt();
            for (int i=0; i<liczba; i++) {
                System.out.println("Hello World");
            }
        }while(liczba!=0);


        int pier;
        do{
            pier = scanner.nextInt();
            for(int i=0; i<=pier; i++){
                if(i*i==pier){
                    System.out.println(i);
                    break;
                }
            }
        }while(pier!=0);
    }
}
