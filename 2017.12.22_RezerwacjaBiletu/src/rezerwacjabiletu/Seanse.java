package rezerwacjabiletu;

import java.util.Date;
import java.util.PrimitiveIterator;

public class Seanse {
    private Film film;
    private Date dataSeansu;
    private double cena;
    private Sala sala;
    private MiejsceNaSeansie miejsce;
    private Kino kino;

    public Seanse(Film film, Date dataSeansu, double cena, Sala sala, MiejsceNaSeansie miejsce, Kino kino) {
        this.film = film;
        this.dataSeansu = dataSeansu;
        this.cena = cena;
        this.sala = sala;
        this.miejsce = miejsce;
        this.kino = kino;
    }



}
