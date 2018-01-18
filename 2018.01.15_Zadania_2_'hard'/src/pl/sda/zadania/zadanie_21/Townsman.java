package pl.sda.zadania.zadanie_21;

public class Townsman extends Citizen {
    private String name;

    public Townsman(String name) {
        super(name);
    }

    @Override
    public boolean canVote() {
        return true;
    }
}
