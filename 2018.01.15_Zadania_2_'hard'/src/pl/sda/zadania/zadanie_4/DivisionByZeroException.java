package pl.sda.zadania.zadanie_4;

public class DivisionByZeroException extends RuntimeException {
    public DivisionByZeroException() {
        super("Nie wolno dzielic przez zero!");
    }
}
