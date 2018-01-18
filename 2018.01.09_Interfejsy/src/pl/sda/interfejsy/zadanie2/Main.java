package pl.sda.interfejsy.zadanie2;

public class Main {
    public static void main(String[] args) {
        Telefon telefon = new Telefon("500200300");
        telefon.zadzwon("999998997");
        telefon.zadzwonNaNrAlarmowy();
    }
}
