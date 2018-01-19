package ZliczaczKaloriezad3;

public class Pokarm {
    private int ileKcal;
    private String nazwa;

    public Pokarm(int ileKcal, String nazwa) {
        this.ileKcal = ileKcal;
        this.nazwa = nazwa;
    }

    @Override
    public String toString() {
        return "Pokarm " +
                "ileKcal=" + ileKcal +
                ", nazwa='" + nazwa + '\'';
    }

    public int getIleKcal() {
        return ileKcal;
    }
}
