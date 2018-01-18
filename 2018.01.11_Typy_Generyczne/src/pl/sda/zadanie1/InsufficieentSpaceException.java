package pl.sda.zadanie1;

public class InsufficieentSpaceException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Nie ma miejsca w garazu";
    }
}
