package rezerwacjabiletu;

public class MiejsceNaSeansie extends Miejsce{
    private boolean czyZarezerwowane;

    public MiejsceNaSeansie(int rzad, int numer, Sala sala, boolean czyZarezerwowane) {
        super(rzad, numer, sala);
        this.czyZarezerwowane = czyZarezerwowane;
    }
}
