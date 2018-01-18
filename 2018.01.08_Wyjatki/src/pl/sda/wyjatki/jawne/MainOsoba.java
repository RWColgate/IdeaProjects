package pl.sda.wyjatki.jawne;

public class MainOsoba {
    public static void main(String[] args) {
        Osoba ania = new Osoba("Ania", 1996);

        try {
            System.out.println(obliczWiekOsobyWRoku(ania, 2017));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Dziekujemy za skorzystanie z aplikacji!");
        }
    }

    static int obliczWiekOsobyWRoku(Osoba osoba, int rok) throws Exception {
        int wiek = rok - osoba.pobierzRokUrodzenia();
        if (wiek < 0) {
            throw new Exception("Nie mozesz miec mniej lat od 0");
        }
        return wiek;
    }

}