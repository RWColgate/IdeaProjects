package pl.sda.obiektowosc.zad8;

import com.sun.rowset.internal.Row;

public class RownanieKwadratowe {
    private double a;
    private double b;
    private double c;

    public RownanieKwadratowe(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double obliczDelte() {
        double wynik = 0;
        return wynik = Math.sqrt(Math.pow(getB(), 2) - 4 * getA() * getC());
    }

    public double obliczX1() {
        double x1 = 0;
        double b=-getB();
        return x1 = ((b - this.obliczDelte()) / (2 * getA()));
    }


    public double obliczX2() {
        double x2 = 0;
        double b=-getB();
        return x2 = ((b + this.obliczDelte()) / (2 * getA()));
    }
}
