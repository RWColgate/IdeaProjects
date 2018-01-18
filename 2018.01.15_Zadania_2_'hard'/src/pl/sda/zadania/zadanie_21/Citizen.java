package pl.sda.zadania.zadanie_21;

public abstract class Citizen {
    private String name;

    abstract public boolean canVote();

    public Citizen(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Citizen : "+ name;
    }
}

