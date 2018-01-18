package pl.sda.zadania.zadanie_8;

public class DeltaLessThanZeroException extends RuntimeException {
    public DeltaLessThanZeroException() {
        super("Delta is less than zero");
    }
}
