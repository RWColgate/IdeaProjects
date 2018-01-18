package pl.sda.obiektowosc.superbohater;

public class WypisanieBohaterow {
    public static void main(String[] args) {
        SuperBohater bohater1 = new SuperBohater("Bohater1", "Zionie ogniem");
        SuperBohater bohater2 = new SuperBohater("Bohater2", "Pluje lava");
        SuperBohater bohater3 = new SuperBohater("Bohater3", "Zamraza dotykiem");

        bohater1.wypiszBohaterow();
        bohater2.wypiszBohaterow();
        bohater3.wypiszBohaterow();

//        bohater1=bohater2;
//        bohater1.wypiszBohaterow();
//        bohater2.wypiszBohaterow();

//        bohater1=null;
//        bohater1.wypiszBohaterow();
//        bohater2.wypiszBohaterow();

//        bohater1.wypiszBohaterow();
//        bohater2.wypiszBohaterow();
    }
}
