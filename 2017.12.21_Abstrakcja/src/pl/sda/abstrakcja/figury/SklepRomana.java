package pl.sda.abstrakcja.figury;

import java.util.Scanner;

public class SklepRomana {
    public static int obliczIloscWiader(Figura[] ksztalty, double wielkoscWiader){
        double pole = 0;
        for(Figura figura:ksztalty){
            pole+=figura.obliczPole();
        }
        int iloscWiader = (int)(pole/wielkoscWiader)+1;
        return iloscWiader;
    }
 }

//    private static void obliczIloscPotrzebnychWiader() {
//    }

