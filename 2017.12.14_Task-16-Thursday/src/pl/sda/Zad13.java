//Zadanie13
package pl.sda;

public class Zad13 {
    public static void main(String[] args) {

        //1
        String[][]tab = new String[8][8];
        for(int i=0; i<8; i++){
            for(int j=1; j<=i; j++){
                tab[i][j] = "# ";
            }
            System.out.println();
        }
        nadpisanieNulli(tab);
        pisanieTablicy(tab);
        System.out.println("       a        ");

        //2
        String[][]tab2 = new String[8][8];
        for(int i=0; i<8; i++){
            for(int j=7; j>=i; j--){
                tab2[i][j] = "# ";
            }
            System.out.println();
        }
        nadpisanieNulli(tab2);
        pisanieTablicy(tab2);
        System.out.println("       b        ");

        //3
        String[][]tab3 = new String[8][8];
        for(int i=0; i<8; i++){
            for(int j=7; j>i; j--){
                tab3[i][j] = " #";
            }
            System.out.println();
        }
        nadpisanieNulli(tab3);
        pisanieTablicy(tab3);
        System.out.println("       c        ");

        //4
        String[][]tab4 = new String[8][8];
        for(int i=0; i<8; i++){
            for(int j=7; j>=i; j--){
                tab4[i][j] = " #";
            }
            System.out.println();
        }

        pisanieTablicy(tab4);
        System.out.println("       d        ");

    }

    private static void nadpisanieNulli(String[][] tab) {
        for (int i=0; i<8; i++){
            for (int j=0; j<8; j++){
                if(tab[i][j]==null)tab[i][j]="  ";
            }
        }
    }

    private static void pisanieTablicy(String[][] tab) {
        for (int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                System.out.print(tab[i][j]);
            }
            System.out.println();
        }
    }
}
