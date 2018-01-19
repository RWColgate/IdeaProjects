package pl.sda.TestWiedzy;

public class TypyDanych {
    public static void main(String[] args) {
        String tekst= "rafal";
        char znakowa = 'f';
        int liczbowa = 1;
         liczbowa= 4;
         int liczbaF = 102;

        System.out.println(liczbowa+znakowa+tekst);
        System.out.println(liczbowa+(znakowa+tekst));

        System.out.println("Kod ASCII litery " + znakowa + " to: " + (int)znakowa);
        System.out.println("Kod ASCII liczby " + liczbaF + " to: " + (char)liczbaF);


    }
}
