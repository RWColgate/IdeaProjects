package pl.sda.interfejsy.domyslny;

public class Main {
    public static void main(String[] args) {
        Gadajacy sokrates = new Filozof();
        Gadajacy kierownik = new Parkingowy();

        sokrates.powiedzCos();
        kierownik.powiedzCos();
    }
}
