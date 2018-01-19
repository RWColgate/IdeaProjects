package pl.sda.interfejsy.zadanie2;

import java.util.Random;

public class Telefon implements Dzwoni {
    private String numerTelefonu;
    private int lacznyCzasRozmowy;
    private int czasRozmowy;
    private int ileGodzin;
    private int ileMinut;
    private int ileSekund;

    public Telefon(String numerTelefonu) {
        this.numerTelefonu = numerTelefonu;
    }

    @Override
    public void zadzwon(String numer) {
        System.out.println("Dzwoni na numer ..." + numer);
        if (new Random().nextBoolean()) {
            System.out.println("Polaczenie nieudane.");
            return;
        }
        czasRozmowy = 30;
        lacznyCzasRozmowy += czasRozmowy;

        ileGodzin += lacznyCzasRozmowy/3600;
        ileMinut += lacznyCzasRozmowy/60;
        ileSekund += lacznyCzasRozmowy%60;

        if(ileGodzin==0 && ileMinut==0){
            System.out.printf("Laczny czas rozmowy: %02d sekund\n\n", ileSekund);
        }
        else if(ileGodzin==0){
            System.out.printf("Laczny czas rozmowy: %02d minut %02d sekund\n\n", ileMinut, ileSekund);
        }
        else if(ileMinut==0){
            System.out.printf("Laczny czas rozmowy: %02d godzin %02d sekund\n\n", ileGodzin, ileSekund);
        }

    }

    @Override
    public void zadzwonNaNrAlarmowy() {
        System.out.printf("Dzwoni na numer alarmowy %s\n",nrAlarmowy);
        if(new Random().nextBoolean()){
            System.out.println("Polaczenie nieudane");
            return;
        }
        czasRozmowy = new Random().nextInt(3600);
        lacznyCzasRozmowy +=czasRozmowy;

        ileGodzin += lacznyCzasRozmowy/3600;
        ileMinut += lacznyCzasRozmowy/60;
        ileSekund += ileMinut%60;

        if(ileGodzin==0 && ileMinut==0){
            System.out.printf("Laczny czas rozmowy: %02d min\n\n", ileSekund);
        }
        else if(ileGodzin==0){
            System.out.printf("Laczny czas rozmowy: %02d:%02d min\n\n", ileMinut, ileSekund);
        }
        else if(ileMinut==0){
            System.out.printf("Laczny czas rozmowy: %02d:00:%02d min\n\n", ileGodzin, ileSekund);
        }
    }


}
