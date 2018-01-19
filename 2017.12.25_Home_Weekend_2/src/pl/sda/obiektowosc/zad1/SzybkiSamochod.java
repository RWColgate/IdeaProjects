package pl.sda.obiektowosc.zad1;

public class SzybkiSamochod extends Samochod {

    public SzybkiSamochod(String kolor, String marka, int rocznik) {
        super(kolor, marka, rocznik);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void przyspiesz(){
        int predkosc = getPredkosc();
        long current = System.currentTimeMillis();
        while(predkosc<200){
            if(System.currentTimeMillis() - current > 300){
                predkosc+=20;
                current = System.currentTimeMillis();
                System.out.printf("Przyspieszam %s do %d km/h\n",this.toString(),predkosc);
            }
        }
    }
}
