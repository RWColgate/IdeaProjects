package pl.sda.obiektowosc.superbohater;

public class SuperBohater {
    private String nazwa;
    private String supermoc;

    public SuperBohater(String nazwa, String supermoc) {
        this.nazwa = nazwa;
        this.supermoc = supermoc;
    }



    void wypiszBohaterow() {
        System.out.println(nazwa + " ma supermoc " + supermoc);
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getSupermoc() {
        return supermoc;
    }
}
