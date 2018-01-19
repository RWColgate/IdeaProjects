package pl.sda.interfejsy.domyslny;

public interface Gadajacy {

    String pomysl();

    default void powiedzCos(){
        System.out.println(pomysl());
    }
}
