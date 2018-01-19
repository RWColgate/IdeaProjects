package pl.sda.obiektowosc.zad2i3;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Wydarzenie {
    private String nazwaWydarzenia;
    MojaData mojaData;


    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    private static final Calendar calendar = Calendar.getInstance();

    public Wydarzenie(String nazwaWydarzenia, MojaData mojaData) {
        this.nazwaWydarzenia = nazwaWydarzenia;
        this.mojaData = mojaData;
    }

    public String getNazwaWydarzenia() {
        return nazwaWydarzenia;
    }
    public MojaData getDataWydarzenia() {
        return mojaData;
    }

    @Override
    public String toString() {
        return "Wydarzenie{" +
                "nazwaWydarzenia='" + nazwaWydarzenia + '\'' +
                ", dataWydarzenia=" + mojaData +
                '}';
    }

    public int ilePozodstaloLat(){
        int wynik = mojaData.getLat() - Calendar.YEAR;
        return wynik;
    }

    public int ilePozostaloMiesiecy(){
        int x = Calendar.MONTH;
        int wynik = mojaData.getMiesiecy() - x+1;
        if(wynik<0)wynik+=12;
        return wynik;
    }

    public int ilePozostaloDni(){
        int wynik = mojaData.getDni() - Calendar.DAY_OF_MONTH;
        if(wynik<0)wynik+=30;
        return wynik;
    }
}
