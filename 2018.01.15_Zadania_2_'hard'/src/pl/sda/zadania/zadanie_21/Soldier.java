package pl.sda.zadania.zadanie_21;

public class Soldier extends Citizen {
    private String name;

    public Soldier(String name) {
        super(name);
    }

    @Override
    public boolean canVote() {
        return true;
    }
}
