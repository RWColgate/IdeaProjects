package pl.sda.interfejsy.zadania;

public class Main {
    public static void main(String[] args) {
        Beben beben = new Beben();

        Gitara gitara = new Gitara();
        Instrumentalny gitara_2 = new Gitara();

        Instrumentalny[] sprzety = {beben,gitara};

        for(Instrumentalny instrument: sprzety){
            instrument.graj();
        }
    }
}
