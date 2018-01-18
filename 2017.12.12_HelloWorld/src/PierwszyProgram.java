public class PierwszyProgram {
    public static void main(String[] args) {

        String hello = "Hello World\n",imie = "Rafal :>", mam = "mam na imie\n";
        String wynik;
        wynik = new StringBuilder(hello).append(mam).append(imie).toString();
        System.out.println(wynik);

    }
}
