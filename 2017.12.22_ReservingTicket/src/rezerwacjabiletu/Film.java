package rezerwacjabiletu;

import java.util.Date;

public class Film {
    private String tytul;
    private String rezyser;
    private long czasTrwania;
    private Date dataPremiery;

    public Film(String tytul, String rezyser, long czasTrwania, Date dataPremiery) {
        this.tytul = tytul;
        this.rezyser = rezyser;
        this.czasTrwania = czasTrwania;
        this.dataPremiery = dataPremiery;
    }
}
