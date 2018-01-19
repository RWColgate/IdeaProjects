package pl.sda.tablice;

public class TablicaDwuWymiarowa {
    public static void main(String[] args) {
        int[][] tab = new int[3][3];
        System.out.println("Wypelnianie tablicy");

        int licznik=0;
        for(int i=0; i<tab.length; i++){
            for(int j=0; j<tab[i].length; j++){
//                tab[i][j] = licznik;
//                licznik++;
                tab[i][j] = 3*i+j;
            }
        }

        System.out.println("Drukowanie tablicy");

        for(int i=0; i<tab.length; i++){
            for(int j=0; j<tab[i].length; j++){
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }
}
