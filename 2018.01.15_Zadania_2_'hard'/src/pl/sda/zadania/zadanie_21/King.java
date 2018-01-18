package pl.sda.zadania.zadanie_21;

public class King extends Citizen {
    private String name;

    public King(String name) {
        super(name);
    }

    @Override
    public boolean canVote() {
        return true;
    }
}
