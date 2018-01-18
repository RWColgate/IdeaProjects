package KsiazkaBibliotekazad7;

public class Ksiazka {
    private String  nazwa;
    private String isbn;
    private String rokWydania;
    private String autor;

    public Ksiazka(String nazwa, String isbn, String rokWydania, String autor) {
        this.nazwa = nazwa;
        this.isbn = isbn;
        this.rokWydania = rokWydania;
        this.autor = autor;
    }

    public String getNazwa() {
        return nazwa;
    }

    @Override
    public String toString() {
        return "Ksiazka{" +"nazwa='" + nazwa + '\'' +", isbn='" + isbn + '\'' +", rokWydania=" + rokWydania +", autor='" + autor + '\'' +'}';
    }
}
