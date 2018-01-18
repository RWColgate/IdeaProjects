package pl.sda.obiektowosc.sale;

public class Manager {
    String imie;
    Sala[] zarzadzaneSale;

    void wyswietlDostepneSale(){
        for(int i=0; i<zarzadzaneSale.length; i++){
            if(zarzadzaneSale[i].czyJestWolna){
                zarzadzaneSale[i].wyswietlOpis();
                System.out.println("________________________");
            }
        }
//         //przyklad jak zroic powyzszego fora
//        for(Sala sala:zarzadzaneSale){
//            if(sala.czyJestWolna){
//                sala.wyswietlOpis();
//            }
//        }
    }
    void zabookujSale(String nazwaSali){
        for(Sala sala:zarzadzaneSale){
            if(sala.nazwa.equals(nazwaSali)){
                sala.czyJestWolna = false;
            }
        }
    }
}
