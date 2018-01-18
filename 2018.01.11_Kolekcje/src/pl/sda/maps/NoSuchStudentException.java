package pl.sda.maps;

public class NoSuchStudentException extends RuntimeException {

    public NoSuchStudentException() {
        super("nie ma studenta");
    }
}
