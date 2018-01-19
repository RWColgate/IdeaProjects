package pl.sda.dziedziczenie.ludzie;

public class Osoba {
    private String imie;
    private String nazwisko;
    private int rokUrodzenia;

    public Osoba(String imie, String nazwisko, int rokUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }

    public String getImie() {
        return imie;
    }

    public String toString() {
        String opis = String .format("Osoba: %s %s, lat %d",imie,nazwisko,2017-rokUrodzenia);
        return opis;
    }

    public static void main(String[] args) {
        Osoba rafal = new Osoba("Rafal", "Walas",1996);
        System.out.println(rafal);
        StudentPrawa studentPrawa = new StudentPrawa("Maciej","Mackowski",1996,9L);
        System.out.println(studentPrawa);

        StudentPrawa mirek = new StudentPrawa("Miroslaw","Mirkowski",1997,12312312312L);
        StudentPrawa stefan = new StudentPrawa("Stanislaw","Kowalski",1995,9L);

        System.out.println(studentPrawa.equals(stefan));
        System.out.println(studentPrawa.equals(mirek));
    }


    public void  przedstawSie(){
        System.out.println(String.format("Czesc, nazywam sie %s %s, i mam %d lat ", imie, nazwisko, 2017-rokUrodzenia));
    }


}
