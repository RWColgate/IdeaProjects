package pl.sda.obiektowosc.zad8;

public class Main {
    public static void main(String[] args) {
        RownanieKwadratowe rk = new RownanieKwadratowe(-2,-8,10);
        System.out.println("Pierwiastek z delty = " + rk.obliczDelte());
        System.out.println("x1 = " + rk.obliczX1());
        System.out.println("x2 = " + rk.obliczX2());

    }
}
