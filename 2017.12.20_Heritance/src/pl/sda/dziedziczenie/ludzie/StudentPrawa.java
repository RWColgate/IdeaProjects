package pl.sda.dziedziczenie.ludzie;

public class StudentPrawa extends Osoba {
    private long indeks;
    final public int x = 3;
    public String toString() {
        String opis = super.toString();
        return opis.replaceAll("Osoba","Student prawa");
    }

    public StudentPrawa(String imie, String nazwisko, int rokUrodzenia, long numerAlbumu) {
        super(imie, nazwisko, rokUrodzenia);
        this.indeks = numerAlbumu;
    }

    public boolean equals(Object obj) {
        if(obj instanceof StudentPrawa){
            StudentPrawa tamten = (StudentPrawa) obj;
            if(this.indeks == tamten.indeks){
                return true;
            }else return false;

        } else return false;
    }

    public long podajNumerIndeksu(){
        return this.indeks;
    }

    @Override
    public void przedstawSie() {
        System.out.printf(String.format("Czesc mam na imie %s, i studiuje prawo\n", getImie()));
    }

    //    public StudentPrawa przedstawSieProsze(){
//
//    }
    public static void main(String[] args) {
        StudentPrawa jacek = new StudentPrawa("Jacek", "Chylinski", 1995, 17097);
        jacek.przedstawSie();
        System.out.println(jacek.indeks);
        System.out.println();

    }
}
