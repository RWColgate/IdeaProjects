package rezerwacjabiletu;

public class Miejsce {
    private int rzad;
    private int numer;
    private Sala sala;


    public Miejsce(int rzad, int numer, Sala sala) {
        this.rzad = rzad;
        this.numer = numer;
        this.sala = sala;
    }

    public int getRzad() {
        return rzad;
    }

    public int getNumer() {
        return numer;
    }

    public Sala getSala() {
        return sala;
    }
}
