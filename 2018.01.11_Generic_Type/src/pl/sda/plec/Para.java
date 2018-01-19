package pl.sda.plec;

import javax.rmi.CORBA.StubDelegate;
import java.util.jar.JarEntry;

public class Para<T extends Czlowiek> {
    private T lewy;
    private T prawy;

    public Para(T lewy, T prawy) {
        this.lewy = lewy;
        this.prawy = prawy;
    }

    public T pobierzLewy() {
        return lewy;
    }

    public T pobierzPrawy() {
        return prawy;
    }

    @Override
    public String toString() {
        return String.format("[%s : %s]", lewy, prawy);
    }

    public static void main(String[] args) {
        Czlowiek adam = new Czlowiek("Adam", "Pierwszy", Plec.MEZCZYZNA);
        Czlowiek eva = new Czlowiek("Eva", "Pierwsza", Plec.KOBIETA);
        Para<Czlowiek> para = new Para<>(adam, eva);
        System.out.println(para);
        para.zamien();
        System.out.println(para);
        Student jan = new Student("Jan", "Kowalski", Plec.MEZCZYZNA);
        Para<Czlowiek> para2 = new Para<>(jan, eva);
        System.out.println(para2);
        para.rozbijPare(jan);
        System.out.println(para);
    }

    private void zamien() {
        T pom = lewy;
        lewy = prawy;
        prawy = pom;
    }

    public void rozbijPare(T trzeci) {
        if (trzeci.pobierzPlec() == lewy.pobierzPlec()) {
            lewy = trzeci;
        } else if (trzeci.pobierzPlec() == prawy.pobierzPlec()) {
            prawy = trzeci;
        }
    }
}
