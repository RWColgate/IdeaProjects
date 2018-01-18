package pl.sda.interfejsy.domyslny;

public interface GadajacyGlosno extends Gadajacy {
    @Override
    default void powiedzCos() {
        System.out.println(pomysl().toUpperCase());
    }
}
