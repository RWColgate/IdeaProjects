package pl.sda.wyjatki.bank;

public class InsufficientFundsException extends RuntimeException{

    @Override
    public String getMessage() {
        return "Niewysarczajaca ilosc srodkow";
    }
}
