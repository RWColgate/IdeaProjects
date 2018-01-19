package pl.sda.maps;

public class Student {
    private long numerIndeksu;
    private String imie;
    private String nazwisko;

    public Student(long numerIndeksu, String imie, String nazwisko) {
        this.numerIndeksu = numerIndeksu;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public long getNumerIndeksu() {
        return numerIndeksu;
    }


    @Override
    public String toString() {
        return  "numerIndeksu=" + numerIndeksu + ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'';
    }
}
