package pl.sda.obiektowosc.psiaki;


public class Pies {
    String imie;
    int rokUrodzenia;
    String kolorSiersci;

    public static void main(String[] args) {
        Pies burek = new Pies();
        burek.imie = "Burek";
        burek.rokUrodzenia = 2015;
        burek.kolorSiersci = "zielony";
        System.out.println("Burek: ");
        burek.dajGlos();

        Pies mietek = new Pies();
        mietek.imie = "Mietek";
        mietek.rokUrodzenia =2016;
        mietek.kolorSiersci = "brazowy";
        System.out.println("Mietek: ");
        mietek.dajGlos();


    }
    void dajGlos(){
        int ileRazy = 2017-rokUrodzenia;
        for(int i=0; i<ileRazy; i++){
        System.out.println("Szczek ruf ruf!");
        }
    }
}