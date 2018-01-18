package pl.sda.obiektowosc.zad15;

public class Main {
    public static void main(String[] args) {
        int[] tablicaIntow = new int[100];
        Lista lista = new Lista(tablicaIntow,100,5);

        for(int i=0; i<tablicaIntow.length; i++){
            System.out.println(tablicaIntow[i]);
        }
    }
}
