package pl.sda.varargs;

public class VarArgsTest {
    public static void main(String[] args) {
        wydrukuj("Ala");
        wydrukuj("Ala", "ma", "Kota",".");

    }

    static void wydrukuj(String... tekst){
        for(String slowo:tekst){
            System.out.println(slowo);
        }
    }
}
