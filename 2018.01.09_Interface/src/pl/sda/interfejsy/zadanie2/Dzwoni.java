package pl.sda.interfejsy.zadanie2;


public interface Dzwoni {
    static String nrAlarmowy = "112";

    void zadzwon(String numer);
    void zadzwonNaNrAlarmowy();
}
