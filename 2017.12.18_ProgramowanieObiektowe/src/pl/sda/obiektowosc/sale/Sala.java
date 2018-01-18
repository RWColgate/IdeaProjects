package pl.sda.obiektowosc.sale;

public class Sala {
    String nazwa;
    double wielkosc;
    int iloscMiejsc;
    boolean czyJestWolna=true;
    boolean czyJestRzutnik;

    public Sala(String nazwa, double wielkosc, int iloscMiejsc, boolean czyJestRzutnik) {
        this.nazwa = nazwa;
        this.wielkosc = wielkosc;
        this.iloscMiejsc = iloscMiejsc;
        this.czyJestRzutnik = czyJestRzutnik;
}

    public Sala(){

    }
    public Sala(String nazwa, double wielkosc, int iloscMiejsc, boolean czyJestRzutnik, boolean czyJestWolna){


    }

    void wyswietlOpis(){
        System.out.println("Nazwa: " + nazwa);
        System.out.println("Wielkosc: " + wielkosc);
        System.out.println("Ilosc miejsc wolnych: " + iloscMiejsc);
        if(czyJestRzutnik){
        System.out.println("Sala posiada rzutnik");
        }else{
            System.out.println("Sala nie posiada rzutnika");
        }


        }
}

