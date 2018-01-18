package rezerwacjabiletu;

public class Adres {
    private String ulice;
    private String miasto;
    private String kodPocztowy;
    private String panstwo;

    public Adres(String ulice, String miasto, String kodPocztowy, String panstwo) {
        this.ulice = ulice;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
        this.panstwo = panstwo;
    }
}
