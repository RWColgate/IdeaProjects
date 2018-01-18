package pl.sda.wyscig.wyscig;

import java.util.Random;

public class Zawodnik {
    private String imie;
    private int identyfikator;
    private int predkoscMinimalna;
    private int predkoscMaksymalna;
    private int pokonanaOdleglosc;

    public Zawodnik(String imie, int identyfikator, int predkoscMinimalna, int predkoscMaksymalna) {
        this.imie = imie;
        this.identyfikator = identyfikator;
        this.predkoscMinimalna = predkoscMinimalna;
        this.predkoscMaksymalna = predkoscMaksymalna;
    }
    public static void main(String[] args) {
        Random r = new Random();
        Zawodnik robert = new Zawodnik("Robert", 4, 10, 20);
        Zawodnik rafal = new Zawodnik("Rafal", 5, 12,24);
        Zawodnik sasza = new Zawodnik("Sasza", 6, 12,32);

        int i=0;
        Zawodnik[] zawodnicy = new Zawodnik[]{sasza,rafal,robert};
        do{
            i = r.nextInt(3);
            zawodnicy[i].biegnij();
        }while(zawodnicy[i].pokonanaOdleglosc<50);
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getIdentyfikator() {
        return identyfikator;
    }

    public void setIdentyfikator(int identyfikator) {
        this.identyfikator = identyfikator;
    }

    public int getPredkoscMinimalna() {
        return predkoscMinimalna;
    }

    void przedstawSie() {
        System.out.printf("Nazywam sie %s, mam identyfikator %d i biegam od %d do %d" + imie, identyfikator, predkoscMinimalna, predkoscMaksymalna);
    }
    void biegnij(){
        Random r = new Random();
        pokonanaOdleglosc += r.nextInt(predkoscMaksymalna-predkoscMinimalna)+predkoscMinimalna;
        System.out.println(imie + " przebiegl: " + pokonanaOdleglosc + "km");
    }

}
