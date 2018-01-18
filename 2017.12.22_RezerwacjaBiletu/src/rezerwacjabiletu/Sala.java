package rezerwacjabiletu;

import java.util.List;

public class Sala {
    private Miejsce[] miejsca;
    private String nazwa;

    public Sala(Miejsce[] miejsca, String nazwa) {
        this.miejsca = miejsca;
        this.nazwa = nazwa;
    }
}
