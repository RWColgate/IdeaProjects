package pl.sda.zadania.zadanie_21;

public class Peasant extends Citizen {
    private String name;

    public Peasant(String name) {
        super(name);
    }

    @Override
    public boolean canVote() {
        return false;
    }
}
