package pl.sda.zadania.zadanie_10;

public class Field {
    private boolean[][] pole;

    public Field(int a, int b) {
        pole = new boolean[a][b];
    }
    public void printField(int a, int b){
        System.out.println(" - - - ");
        if(pole[a][b] == true){
        System.out.printf(" | X | ");
        }
        if(pole[a][b] == false){
        System.out.printf(" | O | \n");
        }
        System.out.println(" - - - ");
    }
//    public void checkCell{
//
//    }
}
