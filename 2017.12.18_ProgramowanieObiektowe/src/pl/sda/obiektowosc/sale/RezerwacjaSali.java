package pl.sda.obiektowosc.sale;

public class RezerwacjaSali {
    public static void main(String[] args) {
        Sala gdansk = new Sala("Gdansk", 30, 7, true);
        Sala salaC = new Sala("Sala C", 40, 15, true);
        Sala mountEverest = new Sala("Mount Everest", 500, 29, true);
        Sala dublin = new Sala("Dublin", 120, 10, true);


        Sala[] sale = new Sala[]{gdansk, salaC, mountEverest,dublin};


        Manager jan = new Manager();
        jan.imie = "Jan";
        jan.zarzadzaneSale = sale;

        System.out.println("Przed bookowaniem: ");
        jan.wyswietlDostepneSale();
        jan.zabookujSale("Sala C");
        System.out.println("Po bookowaniu");
        System.out.println();
        jan.wyswietlDostepneSale();
    }
}