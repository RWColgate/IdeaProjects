package pl.sda.obiektowosc.zad15;

public class Lista {
    private int[] liczby;
    private int pojemnosc;
    private int rozmiar;

    public Lista(int[] liczby, int pojemnosc, int rozmiar) {
        this.liczby = liczby;
        this.pojemnosc = pojemnosc;
        this.rozmiar = rozmiar;
    }

    public boolean dodajElement(int x){

        return true;
    }

    public int znajdz(int x){
        for(int i=0; i<liczby.length; i++){
            if(liczby[i]==x)return i;
        }
        return 1;
    }

    public void wyswietlListe(){

        //wyswietla dane o liscie
        System.out.println("Aktualna pojemnosc tablicy to: " + liczby.length);
        // np aktualna pojemnosc
        System.out.println("Max rozmiar tablicy to: " + liczby.length);
        //max rozmiar, oraz przechowywwane elementy
    }

    public void usunPowtorzenia(){
        int pom;
        for(int i=0; i<liczby.length; i++){
            pom = liczby[i];
            for(int j=i ;j<liczby.length; j++){
//                if(pom==liczby[j+1])liczby[j]
            }
        }

    }

    public void odwrocListe(){

    }


}
