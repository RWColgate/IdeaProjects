package pl.sda.obiektowosc.zgadnijhaslo;

public class Ulamek {
    private int licznik;
    private int mianownik;


    public Ulamek(int licznik, int mianownik) {
        this.mianownik = mianownik;
        this.licznik = licznik;
        skroc();
    }


    void wyswietlanieUlamek() {
//        boolean koniec = false;
//        do {
//            if (mianownik % 2 == 0 && licznik % 2 == 0) {
//                mianownik /= 2;
//                licznik /= 2;
//                koniec = false;
//            } else koniec = true;
//            if(mianownik%3 == 0 && licznik %3 ==0){
//                licznik/=3;
//                mianownik/=3;
//                koniec = false;
//            }
//            else koniec = true;
//        } while (koniec == false);
        skroc();
        int liczbaCalosci = licznik / mianownik;
        int reszta = licznik % mianownik;
        if (liczbaCalosci == 0) {
            System.out.printf("%d/%d ", reszta, mianownik);
        } else if (liczbaCalosci >= 1) {
            System.out.printf("%d i %d/%d ", liczbaCalosci, reszta, mianownik);
        }

    }

    public Ulamek pomnoz(Ulamek przez) {
        int licznik = this.licznik * przez.licznik;
        int mianownik = this.mianownik * przez.mianownik;
        return new Ulamek(licznik, mianownik);
    }

    public Ulamek podziel(Ulamek podziel) {
        int pom = podziel.mianownik;
        podziel.mianownik = podziel.licznik;
        podziel.licznik = pom;
        int licznik = this.licznik * podziel.licznik;
        int mianownik = this.mianownik * podziel.mianownik;
        return new Ulamek(licznik, mianownik);
    }

    public Ulamek dodaj(Ulamek dodaj) {

        int licznik = this.licznik * dodaj.mianownik + dodaj.licznik * this.mianownik;
        int mianownik = this.mianownik * dodaj.mianownik;
        return new Ulamek(licznik, mianownik);
    }

    public Ulamek odejmuj(Ulamek odejmuj){
        int licznik = this.licznik * odejmuj.mianownik - odejmuj.licznik * this.mianownik;
        int mianownik = this.mianownik * odejmuj.mianownik;
        return new Ulamek(licznik, mianownik);
    }
    public void skroc(){
        int nwd = 1;
        do{
            nwd = ObliczNWD();
            licznik /= nwd;
            mianownik /= nwd;
        }while(nwd!=1);
    }
    private int ObliczNWD(){
        int nwd = 1;
        int mniejsza = licznik > mianownik ? mianownik : licznik;
        for(int i=2; i<=mniejsza; i++){
            if(licznik%i==0 && mianownik%i==0){
                nwd = i;
            }
        }
        return nwd;
    }

    public static void main(String[] args) {
        Ulamek t = new Ulamek(1000, 5000);
        t.wyswietlanieUlamek();

        Ulamek jeden = new Ulamek(7, 8);
        Ulamek dwa = new Ulamek(4, 5);

//        Ulamek wynikMnozenia = jeden.pomnoz(dwa);
//        Ulamek wynikDodawania = jeden.dodaj(dwa);
//        Ulamek wynikDzielenia = jeden.podziel(dwa);
        Ulamek wynikOdejmowania = jeden.odejmuj(dwa);

//        wynikDodawania.wyswietlanieUlamek();
//        wynikDodawania.wyswietlanieUlamek();
//        wynikMnozenia.wyswietlanieUlamek();
        wynikOdejmowania.wyswietlanieUlamek();
    }
}
